package org.korbik.scodec.iso8583.decoder

import java.nio.charset.{Charset, StandardCharsets}

import scodec.bits.ByteVector
import scodec.{Attempt, Codec}

object ISO8583Decoders {
  val cp875: Charset = Charset.forName("x-IBM875")

  def ans(size: Long): Codec[String] =
    scodec.codecs.fixedSizeBytes(size, scodec.codecs.string(cp875))

  def a(size: Long): Codec[String] =
    codecString(ans(size)) { (str: String) =>
      if (aRegex.pattern
            .matcher(str)
            .matches()) { Attempt.successful(str) } else {
        Attempt.failure(scodec.Err("Invalid character only alpha characters"))
      }
    }

  def an(size: Long): Codec[String] =
    codecString(ans(size)) { (str: String) =>
      if (anRegex.pattern
            .matcher(str)
            .matches()) { Attempt.successful(str) } else {
        Attempt.failure(
          scodec.Err("Invalid character only alphanumeric characters"))
      }
    }
  def s(size: Long): Codec[String] =
    codecString(ans(size)) { (str: String) =>
      if (!anRegex.pattern
            .matcher(str)
            .matches()) { Attempt.successful(str) } else {
        Attempt.failure(scodec.Err("Invalid character only special characters"))
      }
    }

  def n(nibbles: Int): Codec[Long] =
    scodec.codecs.lpbcd(nibbles)

  def hex(size: Int): Codec[ByteVector] = scodec.codecs.bytes(size)

  def L[A](codec: Codec[A]) =
    scodec.codecs
      .variableSizeBytesLong(scodec.codecs.pbcd(1), codec)

  def LL[A](codec: Codec[A]) =
    scodec.codecs
      .variableSizeBytesLong(scodec.codecs.pbcd(2), codec)

  def LLL[A](codec: Codec[A]) =
    scodec.codecs
      .variableSizeBytesLong(scodec.codecs.lpbcd(3), codec)

  private val aRegex = "[A-Za-z]".r

  private val anRegex = "[A-Za-z0-9]".r

  private def codecString(codec: Codec[String])(
      f: (String) ⇒ Attempt[String]): Codec[String] = {
    Codec.apply(codec.asEncoder, codec.asDecoder.emap(f))
  }
}
