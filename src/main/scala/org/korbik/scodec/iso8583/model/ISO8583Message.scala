package org.korbik.scodec.iso8583.model

import scodec.bits.BitVector

case class GenericISO8583Message[
    F02,
    F03,
    F04,
    F05,
    F06,
    F07,
    F08,
    F09,
    F10,
    F11,
    F12,
    F13,
    F14,
    F15,
    F16,
    F17,
    F18,
    F19,
    F20,
    F21,
    F22,
    F23,
    F24,
    F25,
    F26,
    F27,
    F28,
    F29,
    F30,
    F31,
    F32,
    F33,
    F34,
    F35,
    F36,
    F37,
    F38,
    F39,
    F40,
    F41,
    F42,
    F43,
    F44,
    F45,
    F46,
    F47,
    F48,
    F49,
    F50,
    F51,
    F52,
    F53,
    F54,
    F55,
    F56,
    F57,
    F58,
    F59,
    F60,
    F61,
    F62,
    F63,
    F64,
    F65,
    F66,
    F67,
    F68,
    F69,
    F70,
    F71,
    F72,
    F73,
    F74,
    F75,
    F76,
    F77,
    F78,
    F79,
    F80,
    F81,
    F82,
    F83,
    F84,
    F85,
    F86,
    F87,
    F88,
    F89,
    F90,
    F91,
    F92,
    F93,
    F94,
    F95,
    F96,
    F97,
    F98,
    F99,
    F100,
    F101,
    F102,
    F103,
    F104,
    F105,
    F106,
    F107,
    F108,
    F109,
    F110,
    F111,
    F112,
    F113,
    F114,
    F115,
    F116,
    F117,
    F118,
    F119,
    F120,
    F121,
    F122,
    F123,
    F124,
    F125,
    F126,
    F127,
    F128](
    bitmapsFields: BitmapsFields,
    mti: String,
    field02: Option[F02] = None,
    field03: Option[F03] = None,
    field04: Option[F04] = None,
    field05: Option[F05] = None,
    field06: Option[F06] = None,
    field07: Option[F07] = None,
    field08: Option[F08] = None,
    field09: Option[F09] = None,
    field10: Option[F10] = None,
    field11: Option[F11] = None,
    field12: Option[F12] = None,
    field13: Option[F13] = None,
    field14: Option[F14] = None,
    field15: Option[F15] = None,
    field16: Option[F16] = None,
    field17: Option[F17] = None,
    field18: Option[F18] = None,
    field19: Option[F19] = None,
    field20: Option[F20] = None,
    field21: Option[F21] = None,
    field22: Option[F22] = None,
    field23: Option[F23] = None,
    field24: Option[F24] = None,
    field25: Option[F25] = None,
    field26: Option[F26] = None,
    field27: Option[F27] = None,
    field28: Option[F28] = None,
    field29: Option[F29] = None,
    field30: Option[F30] = None,
    field31: Option[F31] = None,
    field32: Option[F32] = None,
    field33: Option[F33] = None,
    field34: Option[F34] = None,
    field35: Option[F35] = None,
    field36: Option[F36] = None,
    field37: Option[F37] = None,
    field38: Option[F38] = None,
    field39: Option[F39] = None,
    field40: Option[F40] = None,
    field41: Option[F41] = None,
    field42: Option[F42] = None,
    field43: Option[F43] = None,
    field44: Option[F44] = None,
    field45: Option[F45] = None,
    field46: Option[F46] = None,
    field47: Option[F47] = None,
    field48: Option[F48] = None,
    field49: Option[F49] = None,
    field50: Option[F50] = None,
    field51: Option[F51] = None,
    field52: Option[F52] = None,
    field53: Option[F53] = None,
    field54: Option[F54] = None,
    field55: Option[F55] = None,
    field56: Option[F56] = None,
    field57: Option[F57] = None,
    field58: Option[F58] = None,
    field59: Option[F59] = None,
    field60: Option[F60] = None,
    field61: Option[F61] = None,
    field62: Option[F62] = None,
    field63: Option[F63] = None,
    field64: Option[F64] = None,
    field65: Option[F65] = None,
    field66: Option[F66] = None,
    field67: Option[F67] = None,
    field68: Option[F68] = None,
    field69: Option[F69] = None,
    field70: Option[F70] = None,
    field71: Option[F71] = None,
    field72: Option[F72] = None,
    field73: Option[F73] = None,
    field74: Option[F74] = None,
    field75: Option[F75] = None,
    field76: Option[F76] = None,
    field77: Option[F77] = None,
    field78: Option[F78] = None,
    field79: Option[F79] = None,
    field80: Option[F80] = None,
    field81: Option[F81] = None,
    field82: Option[F82] = None,
    field83: Option[F83] = None,
    field84: Option[F84] = None,
    field85: Option[F85] = None,
    field86: Option[F86] = None,
    field87: Option[F87] = None,
    field88: Option[F88] = None,
    field89: Option[F89] = None,
    field90: Option[F90] = None,
    field91: Option[F91] = None,
    field92: Option[F92] = None,
    field93: Option[F93] = None,
    field94: Option[F94] = None,
    field95: Option[F95] = None,
    field96: Option[F96] = None,
    field97: Option[F97] = None,
    field98: Option[F98] = None,
    field99: Option[F99] = None,
    field100: Option[F100] = None,
    field101: Option[F101] = None,
    field102: Option[F102] = None,
    field103: Option[F103] = None,
    field104: Option[F104] = None,
    field105: Option[F105] = None,
    field106: Option[F106] = None,
    field107: Option[F107] = None,
    field108: Option[F108] = None,
    field109: Option[F109] = None,
    field110: Option[F110] = None,
    field111: Option[F111] = None,
    field112: Option[F112] = None,
    field113: Option[F113] = None,
    field114: Option[F114] = None,
    field115: Option[F115] = None,
    field116: Option[F116] = None,
    field117: Option[F117] = None,
    field118: Option[F118] = None,
    field119: Option[F119] = None,
    field120: Option[F120] = None,
    field121: Option[F121] = None,
    field122: Option[F122] = None,
    field123: Option[F123] = None,
    field124: Option[F124] = None,
    field125: Option[F125] = None,
    field126: Option[F126] = None,
    field127: Option[F127] = None,
    field128: Option[F128] = None)

case class BitmapsFields(val bitmap: BitVector) {
  val maxSize = bitmap.size

  def contains(pos: Long): Boolean = {
    require(pos > 0 && pos <= maxSize, "Outbound position")
    bitmap(pos - 1)
  }
}

object BitmapsFields {
  def apply(
      message: GenericISO8583Message[
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _
      ]): BitmapsFields = {
    val bitmap = BitVector.empty
      .insert(2, message.field02.isDefined)
      .insert(3, message.field03.isDefined)
      .insert(4, message.field04.isDefined)
      .insert(5, message.field05.isDefined)
      .insert(6, message.field06.isDefined)
      .insert(7, message.field07.isDefined)
      .insert(8, message.field08.isDefined)
      .insert(9, message.field09.isDefined)
      .insert(10, message.field10.isDefined)
      .insert(11, message.field11.isDefined)
      .insert(12, message.field12.isDefined)
      .insert(13, message.field13.isDefined)
      .insert(14, message.field14.isDefined)
      .insert(15, message.field15.isDefined)
      .insert(16, message.field16.isDefined)
      .insert(17, message.field17.isDefined)
      .insert(18, message.field18.isDefined)
      .insert(19, message.field19.isDefined)
      .insert(20, message.field20.isDefined)
      .insert(21, message.field21.isDefined)
      .insert(22, message.field22.isDefined)
      .insert(23, message.field23.isDefined)
      .insert(24, message.field24.isDefined)
      .insert(25, message.field25.isDefined)
      .insert(26, message.field26.isDefined)
      .insert(27, message.field27.isDefined)
      .insert(28, message.field28.isDefined)
      .insert(29, message.field29.isDefined)
      .insert(30, message.field30.isDefined)
      .insert(31, message.field31.isDefined)
      .insert(32, message.field32.isDefined)
      .insert(33, message.field33.isDefined)
      .insert(34, message.field34.isDefined)
      .insert(35, message.field35.isDefined)
      .insert(36, message.field36.isDefined)
      .insert(37, message.field37.isDefined)
      .insert(38, message.field38.isDefined)
      .insert(39, message.field39.isDefined)
      .insert(40, message.field40.isDefined)
      .insert(41, message.field41.isDefined)
      .insert(42, message.field42.isDefined)
      .insert(43, message.field43.isDefined)
      .insert(44, message.field44.isDefined)
      .insert(45, message.field45.isDefined)
      .insert(46, message.field46.isDefined)
      .insert(47, message.field47.isDefined)
      .insert(48, message.field48.isDefined)
      .insert(49, message.field49.isDefined)
      .insert(50, message.field50.isDefined)
      .insert(51, message.field51.isDefined)
      .insert(52, message.field52.isDefined)
      .insert(53, message.field53.isDefined)
      .insert(54, message.field54.isDefined)
      .insert(55, message.field55.isDefined)
      .insert(56, message.field56.isDefined)
      .insert(57, message.field57.isDefined)
      .insert(58, message.field58.isDefined)
      .insert(59, message.field59.isDefined)
      .insert(60, message.field60.isDefined)
      .insert(61, message.field61.isDefined)
      .insert(62, message.field62.isDefined)
      .insert(63, message.field63.isDefined)
      .insert(64, message.field64.isDefined)
    val bitmap2 = BitVector.empty
      .insert(1, message.field65.isDefined)
      .insert(2, message.field66.isDefined)
      .insert(3, message.field67.isDefined)
      .insert(4, message.field68.isDefined)
      .insert(5, message.field69.isDefined)
      .insert(6, message.field70.isDefined)
      .insert(7, message.field71.isDefined)
      .insert(8, message.field72.isDefined)
      .insert(9, message.field73.isDefined)
      .insert(10, message.field74.isDefined)
      .insert(11, message.field75.isDefined)
      .insert(12, message.field76.isDefined)
      .insert(13, message.field77.isDefined)
      .insert(14, message.field78.isDefined)
      .insert(15, message.field79.isDefined)
      .insert(16, message.field80.isDefined)
      .insert(17, message.field81.isDefined)
      .insert(18, message.field82.isDefined)
      .insert(19, message.field83.isDefined)
      .insert(20, message.field84.isDefined)
      .insert(21, message.field85.isDefined)
      .insert(22, message.field86.isDefined)
      .insert(23, message.field87.isDefined)
      .insert(24, message.field88.isDefined)
      .insert(25, message.field89.isDefined)
      .insert(26, message.field90.isDefined)
      .insert(27, message.field91.isDefined)
      .insert(28, message.field92.isDefined)
      .insert(29, message.field93.isDefined)
      .insert(30, message.field94.isDefined)
      .insert(31, message.field95.isDefined)
      .insert(32, message.field96.isDefined)
      .insert(33, message.field97.isDefined)
      .insert(34, message.field98.isDefined)
      .insert(35, message.field99.isDefined)
      .insert(36, message.field100.isDefined)
      .insert(37, message.field101.isDefined)
      .insert(38, message.field102.isDefined)
      .insert(39, message.field103.isDefined)
      .insert(40, message.field104.isDefined)
      .insert(41, message.field105.isDefined)
      .insert(42, message.field106.isDefined)
      .insert(43, message.field107.isDefined)
      .insert(44, message.field108.isDefined)
      .insert(45, message.field109.isDefined)
      .insert(46, message.field110.isDefined)
      .insert(47, message.field111.isDefined)
      .insert(48, message.field112.isDefined)
      .insert(49, message.field113.isDefined)
      .insert(50, message.field114.isDefined)
      .insert(51, message.field115.isDefined)
      .insert(52, message.field116.isDefined)
      .insert(53, message.field117.isDefined)
      .insert(54, message.field118.isDefined)
      .insert(55, message.field119.isDefined)
      .insert(56, message.field120.isDefined)
      .insert(57, message.field121.isDefined)
      .insert(58, message.field122.isDefined)
      .insert(59, message.field123.isDefined)
      .insert(60, message.field124.isDefined)
      .insert(61, message.field125.isDefined)
      .insert(62, message.field126.isDefined)
      .insert(63, message.field127.isDefined)
      .insert(64, message.field128.isDefined)

    val sumB2 = bitmap2.bytes.foldLeft(false)((bool1, byte1) =>
      bool1 | (Byte.byte2int(byte1) != 0))
    if (sumB2) {
      BitmapsFields(bitmap.insert(1, true) ++ bitmap2)
    } else {
      BitmapsFields(bitmap)
    }
  }
}
