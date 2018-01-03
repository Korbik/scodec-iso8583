package org.korbik.scodec.iso8583.parsing

import org.specs2._

class IsoFieldSpecs extends Specification {
def is = s2"""
    Lenght isofiels
     fixed field $fixedFields
            LVAR $lvarFields
            field extract BitVector

            type of encoding
            hexa $encodingHexa
            num $encodingNum
            char $encodingChar
  """

  def fixedFields = todo

  def lvarFields = todo

  def encodingHexa = todo

  def encodingNum = todo

  def encodingChar = todo
}
