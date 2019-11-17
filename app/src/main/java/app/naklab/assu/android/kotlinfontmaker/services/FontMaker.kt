package app.naklab.assu.android.kotlinfontmaker.services

import android.graphics.Bitmap
import java.util.ArrayList

class FontMaker {
    companion object {
        internal val U21_EXCLAMATION = "uni21" // !
        internal val U22_DOUBLE_QUOTE = "uni22" // "
        internal val U23_HASH = "uni23" // #
        internal val U24_DOLLAR = "uni24" // $
        internal val U25_PERCENT = "uni25" // %
        internal val U26_AND = "uni26" // &
        internal val U27_SINGLE_QUOTE = "uni27" // '
        internal val U28_ROUND_BRACKET_OP = "uni28" // (
        internal val U29_ROUND_BRACKET_ED = "uni29" // )
        internal val U2A_ASTERISK = "uni2a" // *
        internal val U2B_PLUS = "uni2b" // +
        internal val U2C_COMMA = "uni2c" // comma
        internal val U2D_HYPHEN = "uni2d" // - hyphen
        internal val U2E_PERIOD = "uni2e" // .
        internal val U2F_SLASH = "uni2f" // /
        internal val U30_0 = "uni30" // 0
        internal val U31_1 = "uni31" // 1
        internal val U32_2 = "uni32" // 2
        internal val U33_3 = "uni33" // 3
        internal val U34_4 = "uni34" // 4
        internal val U35_5 = "uni35" // 5
        internal val U36_6 = "uni36" // 6
        internal val U37_7 = "uni37" // 7
        internal val U38_8 = "uni38" // 8
        internal val U39_9 = "uni39" // 9

        internal val U3A_COLON = "uni3a" // : colon
        internal val U3B_SEMI_COLON = "uni3b"// ; semi colon
        internal val U3C_LESS_THAN_SIGN = "uni3c"// < less than sign
        internal val U3D_EQUAL = "uni3d"// = equal
        internal val U3E_GRATER_THAN_SIGN = "uni3e"// > grater than sign
        internal val U3F_QUESTION = "uni3f" // ?
        internal val U40_AT_SIGN = "uni40" // @

        internal val U41_UPPER_A = "uni41"
        internal val U42_UPPER_B = "uni42"
        internal val U43_UPPER_C = "uni43"
        internal val U44_UPPER_D = "uni44"
        internal val U45_UPPER_E = "uni45"
        internal val U46_UPPER_F = "uni46"
        internal val U47_UPPER_G = "uni47"
        internal val U48_UPPER_H = "uni48"
        internal val U49_UPPER_I = "uni49"
        internal val U4A_UPPER_J = "uni4a"
        internal val U4B_UPPER_K = "uni4b"
        internal val U4C_UPPER_L = "uni4c"
        internal val U4D_UPPER_M = "uni4d"
        internal val U4E_UPPER_N = "uni4e"
        internal val U4F_UPPER_O = "uni4f"
        internal val U50_UPPER_P = "uni50"
        internal val U51_UPPER_Q = "uni51"
        internal val U52_UPPER_R = "uni52"
        internal val U53_UPPER_S = "uni53"
        internal val U54_UPPER_T = "uni54"
        internal val U55_UPPER_U = "uni55"
        internal val U56_UPPER_V = "uni56"
        internal val U57_UPPER_W = "uni57"
        internal val U58_UPPER_X = "uni58"
        internal val U59_UPPER_Y = "uni59"
        internal val U5A_UPPER_Z = "uni5a"

        internal val U5B_SQUARE_BRACKET_OP = "uni5b" // [
        internal val U5C_BACK_SLASH = "uni5c" // \
        internal val U5D_SQUARE_BRACKET_ED = "uni5d" // ]
        internal val U5E_CARET = "uni5e" // ^
        internal val U5F_UNDERBAR = "uni5f" // _
        internal val U60_BACK_QUOTE = "uni60" // `

        internal val U61_LOWER_A = "uni61"
        internal val U62_LOWER_B = "uni62"
        internal val U63_LOWER_C = "uni63"
        internal val U64_LOWER_D = "uni64"
        internal val U65_LOWER_E = "uni65"
        internal val U66_LOWER_F = "uni66"
        internal val U67_LOWER_G = "uni67"
        internal val U68_LOWER_H = "uni68"
        internal val U69_LOWER_I = "uni69"
        internal val U6A_LOWER_J = "uni6a"
        internal val U6B_LOWER_K = "uni6b"
        internal val U6C_LOWER_L = "uni6c"
        internal val U6D_LOWER_M = "uni6d"
        internal val U6E_LOWER_N = "uni6e"
        internal val U6F_LOWER_O = "uni6f"
        internal val U70_LOWER_P = "uni70"
        internal val U71_LOWER_Q = "uni71"
        internal val U72_LOWER_R = "uni72"
        internal val U73_LOWER_S = "uni73"
        internal val U74_LOWER_T = "uni74"
        internal val U75_LOWER_U = "uni75"
        internal val U76_LOWER_V = "uni76"
        internal val U77_LOWER_W = "uni77"
        internal val U78_LOWER_X = "uni78"
        internal val U79_LOWER_Y = "uni79"
        internal val U7A_LOWER_Z = "uni7a"

        internal val U7B_CURLY_BRACKETS_OP = "uni7b" // {
        internal val U7C_VETICAL_BAR = "uni7c" // |
        internal val U7D_CURLY_BRACKETS_ED = "uni7d" // }
        internal val U7E_TILDE = "uni7e" // ~

        fun getApplyedFontSize(): Int {
            return 93
        }

        fun getUId(idx: Int): String {
            return if (idx == 0)
                U21_EXCLAMATION
            else if (idx == 1)
                U22_DOUBLE_QUOTE
            else if (idx == 2)
                U23_HASH
            else if (idx == 3)
                U24_DOLLAR
            else if (idx == 4)
                U25_PERCENT
            else if (idx == 5)
                U26_AND
            else if (idx == 6)
                U27_SINGLE_QUOTE
            else if (idx == 7)
                U28_ROUND_BRACKET_OP
            else if (idx == 8)
                U29_ROUND_BRACKET_ED
            else if (idx == 9)
                U2A_ASTERISK
            else if (idx == 10)
                U2B_PLUS
            else if (idx == 11)
                U2C_COMMA
            else if (idx == 12)
                U2D_HYPHEN
            else if (idx == 13)
                U2E_PERIOD
            else if (idx == 14)
                U2F_SLASH
            else if (idx == 15)
                U30_0
            else if (idx == 16)
                U31_1
            else if (idx == 17)
                U32_2
            else if (idx == 18)
                U33_3
            else if (idx == 19)
                U34_4
            else if (idx == 20)
                U35_5
            else if (idx == 21)
                U36_6
            else if (idx == 22)
                U37_7
            else if (idx == 23)
                U38_8
            else if (idx == 24)
                U39_9
            else if (idx == 25)
                U3A_COLON
            else if (idx == 26)
                U3B_SEMI_COLON
            else if (idx == 27)
                U3C_LESS_THAN_SIGN
            else if (idx == 28)
                U3D_EQUAL
            else if (idx == 29)
                U3E_GRATER_THAN_SIGN
            else if (idx == 30)
                U3F_QUESTION
            else if (idx == 31)
                U40_AT_SIGN
            else if (idx == 32)
                U41_UPPER_A
            else if (idx == 33)
                U42_UPPER_B
            else if (idx == 34)
                U43_UPPER_C
            else if (idx == 35)
                U44_UPPER_D
            else if (idx == 36)
                U45_UPPER_E
            else if (idx == 37)
                U46_UPPER_F
            else if (idx == 38)
                U47_UPPER_G
            else if (idx == 39)
                U48_UPPER_H
            else if (idx == 40)
                U49_UPPER_I
            else if (idx == 41)
                U4A_UPPER_J
            else if (idx == 42)
                U4B_UPPER_K
            else if (idx == 43)
                U4C_UPPER_L
            else if (idx == 44)
                U4D_UPPER_M
            else if (idx == 45)
                U4E_UPPER_N
            else if (idx == 46)
                U4F_UPPER_O
            else if (idx == 47)
                U50_UPPER_P
            else if (idx == 48)
                U51_UPPER_Q
            else if (idx == 49)
                U52_UPPER_R
            else if (idx == 50)
                U53_UPPER_S
            else if (idx == 51)
                U54_UPPER_T
            else if (idx == 52)
                U55_UPPER_U
            else if (idx == 53)
                U56_UPPER_V
            else if (idx == 54)
                U57_UPPER_W
            else if (idx == 55)
                U58_UPPER_X
            else if (idx == 56)
                U59_UPPER_Y
            else if (idx == 57)
                U5A_UPPER_Z
            else if (idx == 58)
                U5B_SQUARE_BRACKET_OP
            else if (idx == 59)
                U5C_BACK_SLASH
            else if (idx == 60)
                U5D_SQUARE_BRACKET_ED
            else if (idx == 61)
                U5E_CARET
            else if (idx == 62)
                U5F_UNDERBAR
            else if (idx == 63)
                U60_BACK_QUOTE
            else if (idx == 64)
                U61_LOWER_A
            else if (idx == 65)
                U62_LOWER_B
            else if (idx == 66)
                U63_LOWER_C
            else if (idx == 67)
                U64_LOWER_D
            else if (idx == 68)
                U65_LOWER_E
            else if (idx == 69)
                U66_LOWER_F
            else if (idx == 70)
                U67_LOWER_G
            else if (idx == 71)
                U68_LOWER_H
            else if (idx == 72)
                U69_LOWER_I
            else if (idx == 73)
                U6A_LOWER_J
            else if (idx == 74)
                U6B_LOWER_K
            else if (idx == 75)
                U6C_LOWER_L
            else if (idx == 76)
                U6D_LOWER_M
            else if (idx == 77)
                U6E_LOWER_N
            else if (idx == 78)
                U6F_LOWER_O
            else if (idx == 79)
                U70_LOWER_P
            else if (idx == 80)
                U71_LOWER_Q
            else if (idx == 81)
                U72_LOWER_R
            else if (idx == 82)
                U73_LOWER_S
            else if (idx == 83)
                U74_LOWER_T
            else if (idx == 84)
                U75_LOWER_U
            else if (idx == 85)
                U76_LOWER_V
            else if (idx == 86)
                U77_LOWER_W
            else if (idx == 87)
                U78_LOWER_X
            else if (idx == 88)
                U79_LOWER_Y
            else if (idx == 89)
                U7A_LOWER_Z
            else if (idx == 90)
                U7B_CURLY_BRACKETS_OP
            else if (idx == 91)
                U7C_VETICAL_BAR
            else if (idx == 92)
                U7D_CURLY_BRACKETS_ED
            else if (idx == 93)
                U7E_TILDE
            else
                ""
        }
    }


    internal var fontGlyphs: ArrayList<String>
    internal var edgeDetector: EdgeDetector

    constructor() {
        fontGlyphs = ArrayList()
        edgeDetector = EdgeDetector()
    }

    fun makeFontSvg(fontName: String): String {
        var svg = ""
        svg = createFontSvgStart(fontName.replace("\\s+".toRegex(), ""), fontName)
        for (glyph in fontGlyphs) {
            svg = "$svg            $glyph\n"
        }
        svg = svg + fontSvgEnd
        return svg
    }

    private fun createFontSvgStart(fontId: String, fontFamily: String): String {
        return "<?xml version=\"1.0\" standalone=\"no\"?><!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\"\n" +
                "    \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\" >\n" +
                "<svg>\n" +
                "    <metadata>\n" +
                "        " + "Created by android font maker" + "\n" +
                "    </metadata>\n" +
                "    <defs>\n" +
                "        <font horiz-adv-x=\"2170\" id=\"" + fontId + "\" vert-adv-y=\"2170\">\n" +
                "            <font-face\n" +
                "\n" +
                "                ascent=\"800\"\n" +
                "\n" +
                "                descent=\"-200\"\n" +
                "\n" +
                "                font-family=\"" + fontFamily + "\"\n" +
                "\n" +
                "                font-stretch=\"normal\"\n" +
                "\n" +
                "                font-weight=\"400\"\n" +
                "\n" +
                "                units-per-em=\"1000\"\n" +
                "\n" +
                "            />\n" +
                "            <missing-glyph />\n"
    }

    internal var fontSvgEnd = "\n        </font>\n" +
            "    </defs>\n" +
            "</svg>"

    fun addGlyph(bmp: Bitmap, currentFontId: String) {
        if (FontMaker.U21_EXCLAMATION == currentFontId) {
            addExcla(bmp)
        } else if (FontMaker.U22_DOUBLE_QUOTE == currentFontId) {
            addDoubleQuo(bmp)
        } else if (FontMaker.U23_HASH == currentFontId) {
            addHash(bmp)
        } else if (FontMaker.U24_DOLLAR == currentFontId) {
            addDollar(bmp)
        } else if (FontMaker.U25_PERCENT == currentFontId) {
            addPercent(bmp)
        } else if (FontMaker.U26_AND == currentFontId) {
            addAnd(bmp)
        } else if (FontMaker.U27_SINGLE_QUOTE == currentFontId) {
            addSingleQuo(bmp)
        } else if (FontMaker.U28_ROUND_BRACKET_OP == currentFontId) {
            addRoundBraOp(bmp)
        } else if (FontMaker.U29_ROUND_BRACKET_ED == currentFontId) {
            addRoundBraEd(bmp)
        } else if (FontMaker.U2A_ASTERISK == currentFontId) {
            addAsterisk(bmp)
        } else if (FontMaker.U2B_PLUS == currentFontId) {
            addPlus(bmp)
        } else if (FontMaker.U2C_COMMA == currentFontId) {
            addComma(bmp)
        } else if (FontMaker.U2D_HYPHEN == currentFontId) {
            addHyphen(bmp)
        } else if (FontMaker.U2E_PERIOD == currentFontId) {
            addPeriod(bmp)
        } else if (FontMaker.U2F_SLASH == currentFontId) {
            addSlash(bmp)
        } else if (FontMaker.U30_0 == currentFontId) {
            add0(bmp)
        } else if (FontMaker.U31_1 == currentFontId) {
            add1(bmp)
        } else if (FontMaker.U32_2 == currentFontId) {
            add2(bmp)
        } else if (FontMaker.U33_3 == currentFontId) {
            add3(bmp)
        } else if (FontMaker.U34_4 == currentFontId) {
            add4(bmp)
        } else if (FontMaker.U35_5 == currentFontId) {
            add5(bmp)
        } else if (FontMaker.U36_6 == currentFontId) {
            add6(bmp)
        } else if (FontMaker.U37_7 == currentFontId) {
            add7(bmp)
        } else if (FontMaker.U38_8 == currentFontId) {
            add8(bmp)
        } else if (FontMaker.U39_9 == currentFontId) {
            add9(bmp)
        } else if (FontMaker.U3A_COLON == currentFontId) {
            addColon(bmp)
        } else if (FontMaker.U3B_SEMI_COLON == currentFontId) {
            addSemiColon(bmp)
        } else if (FontMaker.U3C_LESS_THAN_SIGN == currentFontId) {
            addLessThan(bmp)
        } else if (FontMaker.U3D_EQUAL == currentFontId) {
            addEqual(bmp)
        } else if (FontMaker.U3E_GRATER_THAN_SIGN == currentFontId) {
            addGraterThan(bmp)
        } else if (FontMaker.U3F_QUESTION == currentFontId) {
            addQuestion(bmp)
        } else if (FontMaker.U40_AT_SIGN == currentFontId) {
            addAtSign(bmp)
        } else if (FontMaker.U41_UPPER_A == currentFontId) {
            addUpperA(bmp)
        } else if (FontMaker.U42_UPPER_B == currentFontId) {
            addUpperB(bmp)
        } else if (FontMaker.U43_UPPER_C == currentFontId) {
            addUpperC(bmp)
        } else if (FontMaker.U44_UPPER_D == currentFontId) {
            addUpperD(bmp)
        } else if (FontMaker.U45_UPPER_E == currentFontId) {
            addUpperE(bmp)
        } else if (FontMaker.U46_UPPER_F == currentFontId) {
            addUpperF(bmp)
        } else if (FontMaker.U47_UPPER_G == currentFontId) {
            addUpperG(bmp)
        } else if (FontMaker.U48_UPPER_H == currentFontId) {
            addUpperH(bmp)
        } else if (FontMaker.U49_UPPER_I == currentFontId) {
            addUpperI(bmp)
        } else if (FontMaker.U4A_UPPER_J == currentFontId) {
            addUpperJ(bmp)
        } else if (FontMaker.U4B_UPPER_K == currentFontId) {
            addUpperK(bmp)
        } else if (FontMaker.U4C_UPPER_L == currentFontId) {
            addUpperL(bmp)
        } else if (FontMaker.U4D_UPPER_M == currentFontId) {
            addUpperM(bmp)
        } else if (FontMaker.U4E_UPPER_N == currentFontId) {
            addUpperN(bmp)
        } else if (FontMaker.U4F_UPPER_O == currentFontId) {
            addUpperO(bmp)
        } else if (FontMaker.U50_UPPER_P == currentFontId) {
            addUpperP(bmp)
        } else if (FontMaker.U51_UPPER_Q == currentFontId) {
            addUpperQ(bmp)
        } else if (FontMaker.U52_UPPER_R == currentFontId) {
            addUpperR(bmp)
        } else if (FontMaker.U53_UPPER_S == currentFontId) {
            addUpperS(bmp)
        } else if (FontMaker.U54_UPPER_T == currentFontId) {
            addUpperT(bmp)
        } else if (FontMaker.U55_UPPER_U == currentFontId) {
            addUpperU(bmp)
        } else if (FontMaker.U56_UPPER_V == currentFontId) {
            addUpperV(bmp)
        } else if (FontMaker.U57_UPPER_W == currentFontId) {
            addUpperW(bmp)
        } else if (FontMaker.U58_UPPER_X == currentFontId) {
            addUpperX(bmp)
        } else if (FontMaker.U59_UPPER_Y == currentFontId) {
            addUpperY(bmp)
        } else if (FontMaker.U5A_UPPER_Z == currentFontId) {
            addUpperZ(bmp)
        } else if (FontMaker.U5B_SQUARE_BRACKET_OP == currentFontId) {
            addSquareBraOp(bmp)
        } else if (FontMaker.U5C_BACK_SLASH == currentFontId) {
            addBackSlash(bmp)
        } else if (FontMaker.U5D_SQUARE_BRACKET_ED == currentFontId) {
            addSquareBraEd(bmp)
        } else if (FontMaker.U5E_CARET == currentFontId) {
            addCaret(bmp)
        } else if (FontMaker.U5F_UNDERBAR == currentFontId) {
            addUnderbar(bmp)
        } else if (FontMaker.U60_BACK_QUOTE == currentFontId) {
            addBackQuo(bmp)
        } else if (FontMaker.U61_LOWER_A == currentFontId) {
            addLowerA(bmp)
        } else if (FontMaker.U62_LOWER_B == currentFontId) {
            addLowerB(bmp)
        } else if (FontMaker.U63_LOWER_C == currentFontId) {
            addLowerC(bmp)
        } else if (FontMaker.U64_LOWER_D == currentFontId) {
            addLowerD(bmp)
        } else if (FontMaker.U65_LOWER_E == currentFontId) {
            addLowerE(bmp)
        } else if (FontMaker.U66_LOWER_F == currentFontId) {
            addLowerF(bmp)
        } else if (FontMaker.U67_LOWER_G == currentFontId) {
            addLowerG(bmp)
        } else if (FontMaker.U68_LOWER_H == currentFontId) {
            addLowerH(bmp)
        } else if (FontMaker.U69_LOWER_I == currentFontId) {
            addLowerI(bmp)
        } else if (FontMaker.U6A_LOWER_J == currentFontId) {
            addLowerJ(bmp)
        } else if (FontMaker.U6B_LOWER_K == currentFontId) {
            addLowerK(bmp)
        } else if (FontMaker.U6C_LOWER_L == currentFontId) {
            addLowerL(bmp)
        } else if (FontMaker.U6D_LOWER_M == currentFontId) {
            addLowerM(bmp)
        } else if (FontMaker.U6E_LOWER_N == currentFontId) {
            addLowerN(bmp)
        } else if (FontMaker.U6F_LOWER_O == currentFontId) {
            addLowerO(bmp)
        } else if (FontMaker.U70_LOWER_P == currentFontId) {
            addLowerP(bmp)
        } else if (FontMaker.U71_LOWER_Q == currentFontId) {
            addLowerQ(bmp)
        } else if (FontMaker.U72_LOWER_R == currentFontId) {
            addLowerR(bmp)
        } else if (FontMaker.U73_LOWER_S == currentFontId) {
            addLowerS(bmp)
        } else if (FontMaker.U74_LOWER_T == currentFontId) {
            addLowerT(bmp)
        } else if (FontMaker.U75_LOWER_U == currentFontId) {
            addLowerU(bmp)
        } else if (FontMaker.U76_LOWER_V == currentFontId) {
            addLowerV(bmp)
        } else if (FontMaker.U77_LOWER_W == currentFontId) {
            addLowerW(bmp)
        } else if (FontMaker.U78_LOWER_X == currentFontId) {
            addLowerX(bmp)
        } else if (FontMaker.U79_LOWER_Y == currentFontId) {
            addLowerY(bmp)
        } else if (FontMaker.U7A_LOWER_Z == currentFontId) {
            addLowerZ(bmp)
        } else if (FontMaker.U7B_CURLY_BRACKETS_OP == currentFontId) {
            addCurlyBraOp(bmp)
        } else if (FontMaker.U7C_VETICAL_BAR == currentFontId) {
            addVeticalBar(bmp)
        } else if (FontMaker.U7D_CURLY_BRACKETS_ED == currentFontId) {
            addCurlyBraEd(bmp)
        } else if (FontMaker.U7E_TILDE == currentFontId) {
            addTilde(bmp)
        }
    }

    //   // !
    //   <glyph
    //   d="M296 317 L105 317 L105 698 L296 698 L296 317 M73 317L38 317L38 698L73 698L73 317M299 112Q299 57 260.50 18.50Q222-20 167-20Q133-20 105-4L105 227Q133 243 167 243Q221 243 260 204.50Q299 166 299 112M73 19Q36 58 36 112Q36 165 73 204L73 19Z"
    //   glyph-name="uni21" horiz-adv-x="335" unicode="&#x21;" vert-adv-y="1000" />
    fun addExcla(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni21",
            335,
            "&#x21;"
        )
        fontGlyphs.add(glyph)
    }

    //   // "
    //   <glyph d="M36 450L36 766L278 766L88 450L36 450M306 450L306 766L548 766L358 450L306 450Z"
    //   glyph-name="uni22" horiz-adv-x="584" unicode="&#x22;" vert-adv-y="1000" />
    fun addDoubleQuo(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni22",
            584,
            "&#x22;"
        )
        fontGlyphs.add(glyph)
    }

    //   // #
    //   <glyph
    //   d="M323 565L318 531L237 531L231 490L313 490L308 456L227 456L209 324L175 324L193 456L152 456L134 324L100 324L118 456L36 456L41 490L122 490L128 531L46 531L51 565L132 565L150 697L184 697L166 565L207 565L225 697L259 697L241 565L323 565M203 531L162 531L156 490L197 490L203 531Z"
    //   glyph-name="uni23" horiz-adv-x="359" unicode="&#x23;" vert-adv-y="1000" />
    fun addHash(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni23",
            359,
            "&#x23;"
        )
        fontGlyphs.add(glyph)
    }

    //   // $
    //   <glyph
    //   d="M595 210Q595 157 569 110L38 444Q36 464 36 475Q36 578 121.50 641Q207 704 313 704L313 759L345 759L345 703Q462 691 543 597L543 674L574 674L574 543L545 543Q511 596 458.50 630Q406 664 345 671L345 482L493 390Q595 326 595 210M313 501L313 672Q207 672 134 611L313 501M552 83Q517 37 461.50 10.50Q406-16 345-20L345-94L313-94L313-21Q174-19 81 85L81 7L49 7L49 139L78 139Q117 80 179.50 45.50Q242 11 313 9L313 183L138 291Q73 332 48 399L552 83M496 71L345 164L345 10Q435 20 496 71Z"
    //   glyph-name="uni24" horiz-adv-x="631" unicode="&#x24;" vert-adv-y="1000" />
    fun addDollar(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni24",
            631,
            "&#x24;"
        )
        fontGlyphs.add(glyph)
    }

    //   // %
    //   <glyph
    //   d="M308 453Q308 402 271.50 365Q235 328 184 328L160 328Q111 328 74 363L74 662Q109 697 160 697L184 697Q235 697 271.50 660.50Q308 624 308 572L308 453M293 453L293 572Q293 617 260.50 649Q228 681 184 681L167 681L167 344L184 344Q228 344 260.50 376.50Q293 409 293 453M597 125Q597 74 560.50 37Q524 0 473 0L449 0Q400 0 363 35L363 334Q398 369 449 369L473 369Q524 369 560.50 332.50Q597 296 597 244L597 125M582 125L582 244Q582 289 549.50 321Q517 353 473 353L456 353L456 16L473 16Q517 16 549.50 48.50Q582 81 582 125M552 696L118-5L74-5L508 696L552 696M58 383Q36 412 36 453L36 572Q36 610 58 643L58 383M347 55Q325 84 325 125L325 244Q325 284 347 315L347 55Z"
    //   glyph-name="uni25" horiz-adv-x="633" unicode="&#x25;" vert-adv-y="1000" />
    fun addPercent(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni25",
            633,
            "&#x25;"
        )
        fontGlyphs.add(glyph)
    }

    //   // &
    //   <glyph
    //   d="M873 324L792 324L792 233Q792 137 724 68.50Q656 0 560 0L469 0L193 579Q226 641 291.50 675.50Q357 710 431 710Q494 710 552.50 684Q611 658 651 611L651 681L683 681L683 565L655 557Q616 614 558.50 646.50Q501 679 434 679Q416 679 407 678L706 95Q761 155 761 233L761 355L873 355L873 324M434 0L269 0Q173 0 104.50 68.50Q36 137 36 233Q36 303 75 362Q114 421 178 448Q171 461 171 494Q171 518 177 540L434 0M377 32L192 420Q136 396 102 345Q68 294 68 233Q68 150 127 91Q186 32 269 32L377 32Z"
    //   glyph-name="uni26" horiz-adv-x="909" unicode="&#x26;" vert-adv-y="1000" />
    fun addAnd(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni26",
            909,
            "&#x26;"
        )
        fontGlyphs.add(glyph)
    }

    //   // '
    //   <glyph d="M36 450L36 766L278 766L88 450L36 450Z" glyph-name="uni27" horiz-adv-x="314"
    //   unicode="&#x27;" vert-adv-y="1000" />
    fun addSingleQuo(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni27",
            314,
            "&#x27;"
        )
        fontGlyphs.add(glyph)
    }

    //   // (
    //   <glyph
    //   d="M403-154Q320-153 245.50-109Q171-65 124 8L124 603Q172 674 244.50 718Q317 762 403 766L403 734Q378 734 348 729L348-116Q375-122 403-122L403-154M92 62Q36 174 36 306Q36 436 92 550L92 62Z"
    //   glyph-name="uni28" horiz-adv-x="439" unicode="&#x28;" vert-adv-y="1000" />
    fun addRoundBraOp(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni28",
            439,
            "&#x28;"
        )
        fontGlyphs.add(glyph)
    }

    //   // )
    //   <glyph
    //   d="M403 305Q403 172 342 52Q281-68 165-124L165 735Q278 684 340.50 563Q403 442 403 305M134-137Q86-154 36-154L36-122Q65-122 92-116L92 729Q62 734 36 734L36 766Q81 766 134 749L134-137Z"
    //   glyph-name="uni29" horiz-adv-x="439" unicode="&#x29;" vert-adv-y="1000" />
    fun addRoundBraEd(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni29",
            439,
            "&#x29;"
        )
        fontGlyphs.add(glyph)
    }

    //   // *
    //   <glyph
    //   d="M252 601L228 559L170 592L170 525L120 525L120 592L61 559L36 601L95 635L36 669L61 712L120 678L120 746L170 746L170 678L228 713L252 669L194 635L252 601Z"
    //   glyph-name="uni2a" horiz-adv-x="288" unicode="&#x2a;" vert-adv-y="1000" />
    fun addAsterisk(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni2a",
            288,
            "&#x2a;"
        )
        fontGlyphs.add(glyph)
    }

    //   // +
    //   <glyph
    //   d="M408 325L247 325L247 163L198 163L198 325L36 325L36 374L197 374L197 536L246 536L246 374L408 374L408 325Z"
    //   glyph-name="uni2b" horiz-adv-x="444" unicode="&#x2b;" vert-adv-y="1000" />
    fun addPlus(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni28",
            439,
            "&#x28;"
        )
        fontGlyphs.add(glyph)
    }

    //   // ,
    //   <glyph
    //   d="M300 112Q300 76 278 39L185-116L123-80L159-20Q126-17 105-4L105 227Q134 243 167 243Q221 243 260.50 204.50Q300 166 300 112M73 19Q36 59 36 112Q36 164 73 204L73 19Z"
    //   glyph-name="uni2c" horiz-adv-x="336" unicode="&#x2c;" vert-adv-y="1000" />
    fun addComma(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni2c",
            336,
            "&#x2c;"
        )
        fontGlyphs.add(glyph)
    }

    //   // -
    //   <glyph d="M36 324L36 355L194 355L194 324L36 324Z" glyph-name="uni2d" horiz-adv-x="230"
    //   unicode="&#x2d;" vert-adv-y="1000" />
    fun addHyphen(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni2d",
            230,
            "&#x2d;"
        )
        fontGlyphs.add(glyph)
    }

    //   // .
    //   <glyph
    //   d="M299 112Q299 57 260.50 18.50Q222-20 167-20Q133-20 105-4L105 227Q133 243 167 243Q221 243 260 204.50Q299 166 299 112M73 19Q36 58 36 112Q36 165 73 204L73 19Z"
    //   glyph-name="uni2e" horiz-adv-x="335" unicode="&#x2e;" vert-adv-y="1000" />
    fun addPeriod(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni2e",
            335,
            "&#x2e;"
        )
        fontGlyphs.add(glyph)
    }

    //   // /
    //   <glyph d="M518 801L164-199L36-199L390 801L518 801Z" glyph-name="uni2f" horiz-adv-x="554"
    //   unicode="&#x2f;" vert-adv-y="1000" />
    fun addSlash(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni2f",
            554,
            "&#x2f;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 0
    //   <glyph
    //   d="M567 230Q567 129 496 57Q425-15 324-15L279-15Q181-15 110 54L110 637Q181 706 279 706L324 706Q424 706 495.50 634Q567 562 567 462L567 230M537 230L537 462Q537 549 474 611.50Q411 674 324 674L291 674L291 17L324 17Q412 17 474.50 79.50Q537 142 537 230M79 92Q36 151 36 230L36 462Q36 537 79 600L79 92Z"
    //   glyph-name="uni30" horiz-adv-x="603" unicode="&#x30;" vert-adv-y="1000" />
    fun add0(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni30",
            603,
            "&#x30;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 1
    //   <glyph
    //   d="M505 0L242 0L242 652L424 699L424 32L505 32L505 0M211 0L90 0L90 32L170 32L170 600L44 567L36 598L211 643L211 0Z"
    //   glyph-name="uni31" horiz-adv-x="541" unicode="&#x31;" vert-adv-y="1000" />
    fun add1(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni31",
            541,
            "&#x31;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 2
    //   <glyph
    //   d="M545 0L110 0L386 676Q438 645 467.50 589Q497 533 497 472Q497 427 482 393L326 32L513 32L513 129L545 129L545 0M360 690L77 0L36 0L309 676Q289 681 261 681Q199 681 146.50 647Q94 613 70 556L40 567Q68 634 127.50 673Q187 712 259 712Q313 712 360 690Z"
    //   glyph-name="uni32" horiz-adv-x="581" unicode="&#x32;" vert-adv-y="1000" />
    fun add2(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni32",
            581,
            "&#x32;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 3
    //   <glyph
    //   d="M553 475Q553 403 506 343Q553 285 553 212Q553 128 494.50 66Q436 4 351-17L351 703Q437 682 495 621Q553 560 553 475M320-21Q299-24 278-24Q202-24 136.50 10.50Q71 45 36 109L63 123Q94 68 154.50 37.50Q215 7 282 7L282 325L166 325L166 356L282 356L282 680Q215 680 154.50 649Q94 618 63 562L36 578Q72 642 137.50 676.50Q203 711 279 711Q300 711 320 708L320-21Z"
    //   glyph-name="uni33" horiz-adv-x="589" unicode="&#x33;" vert-adv-y="1000" />
    fun add3(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni33",
            589,
            "&#x33;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 4
    //   <glyph
    //   d="M678 0L415 0L415 697L598 697L598 257L678 257L678 226L598 226L598 32L678 32L678 0M383 0L263 0L263 32L344 32L344 226L36 226L308 697L383 697L383 0M344 257L344 665L327 665L90 257L344 257Z"
    //   glyph-name="uni34" horiz-adv-x="714" unicode="&#x34;" vert-adv-y="1000" />
    fun add4(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni34",
            714,
            "&#x34;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 5
    //   <glyph
    //   d="M584 209Q584 135 540 79L103 444L103 698L540 698L540 561L508 561L508 666L301 666L301 545L504 378Q584 312 584 209M519 56Q441-22 310-22Q231-22 161.50 14Q92 50 44 114L70 132Q112 74 177.50 41.50Q243 9 315 9Q395 9 462 50L36 404L36 698L73 698L73 429L519 56Z"
    //   glyph-name="uni35" horiz-adv-x="620" unicode="&#x35;" vert-adv-y="1000" />
    fun add5(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni35",
            620,
            "&#x35;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 6
    //   <glyph
    //   d="M585 223Q585 118 502 49Q419-20 311-20Q229-20 156.50 22.50Q84 65 53 138L308 698L516 698L410 450Q486 424 535.50 362.50Q585 301 585 223M554 220Q554 289 509.50 344Q465 399 398 421L228 24Q268 12 310 12Q404 12 479 70.50Q554 129 554 220M274 698L39 183Q36 202 36 222Q36 272 58 321L233 698L274 698Z"
    //   glyph-name="uni36" horiz-adv-x="621" unicode="&#x36;" vert-adv-y="1000" />
    fun add6(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni36",
            621,
            "&#x36;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 7
    //   <glyph
    //   d="M608 697L319 0L116 0L405 697L608 697M373 697L83 0L36 0L314 665L103 665L103 565L71 565L71 697L373 697Z"
    //   glyph-name="uni37" horiz-adv-x="644" unicode="&#x37;" vert-adv-y="1000" />
    fun add7(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni37",
            644,
            "&#x37;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 8
    //   <glyph
    //   d="M576 226Q576 118 495.50 44Q415-30 306-30Q204-30 127 33L127 653Q208 714 306 714Q412 714 493 645.50Q574 577 574 473Q574 411 539 355Q576 295 576 226M545 226Q545 289 502 355Q541 411 541 472Q541 562 470 622Q399 682 306 682L302 682L302 1L308 1Q403 1 474 66.50Q545 132 545 226M97 65Q36 135 36 228Q36 296 72 355Q39 410 39 472Q39 558 97 622L97 65Z"
    //   glyph-name="uni38" horiz-adv-x="612" unicode="&#x38;" vert-adv-y="1000" />
    fun add8(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni38",
            612,
            "&#x38;"
        )
        fontGlyphs.add(glyph)
    }

    //   // 9
    //   <glyph
    //   d="M585 474Q585 422 564 377L389 0L182 0L472 672Q524 638 554.50 586Q585 534 585 474M444 688L148 0L106 0L212 248Q136 275 86 336Q36 397 36 474Q36 580 120 649Q204 718 312 718Q382 718 444 688M394 674Q355 687 310 687Q215 687 141.50 627Q68 567 68 474Q68 406 112.50 353Q157 300 224 277L394 674Z"
    //   glyph-name="uni39" horiz-adv-x="621" unicode="&#x39;" vert-adv-y="1000" />
    fun add9(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni39",
            621,
            "&#x39;"
        )
        fontGlyphs.add(glyph)
    }

    //   // :
    //   <glyph
    //   d="M299 412Q299 357 260.50 318.50Q222 280 167 280Q133 280 105 296L105 527Q133 543 167 543Q221 543 260 504.50Q299 466 299 412M73 319Q36 358 36 412Q36 465 73 504L73 319M299 112Q299 57 260.50 18.50Q222-20 167-20Q133-20 105-4L105 227Q133 243 167 243Q221 243 260 204.50Q299 166 299 112M73 19Q36 58 36 112Q36 165 73 204L73 19Z"
    //   glyph-name="uni3a" horiz-adv-x="335" unicode="&#x3a;" vert-adv-y="1000" />
    fun addColon(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni3a",
            335,
            "&#x3a;"
        )
        fontGlyphs.add(glyph)
    }

    //   // ;
    //   <glyph
    //   d="M299 412Q299 357 260.50 318.50Q222 280 167 280Q133 280 105 296L105 527Q133 543 167 543Q221 543 260 504.50Q299 466 299 412M73 319Q36 358 36 412Q36 465 73 504L73 319M302 112Q302 76 280 39L187-116L126-80L161-20Q128-16 108-4L108 227Q136 243 170 243Q224 243 263 204.50Q302 166 302 112M76 19Q39 58 39 112Q39 165 76 204L76 19Z"
    //   glyph-name="uni3b" horiz-adv-x="338" unicode="&#x3b;" vert-adv-y="1000" />
    fun addSemiColon(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni3b",
            338,
            "&#x3b;"
        )
        fontGlyphs.add(glyph)
    }

    //   // <
    //   <glyph d="M370 155L36 342L370 528L370 478L128 342L370 205L370 155Z" glyph-name="uni3c"
    //   horiz-adv-x="406" unicode="&#x3c;" vert-adv-y="1000" />
    fun addLessThan(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni3c",
            406,
            "&#x3c;"
        )
        fontGlyphs.add(glyph)
    }

    //   // =
    //   <glyph d="M408 375L36 375L36 424L408 424L408 375M408 275L36 275L36 324L408 324L408 275Z"
    //   glyph-name="uni3d" horiz-adv-x="444" unicode="&#x3d;" vert-adv-y="1000" />
    fun addEqual(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni3d",
            444,
            "&#x3d;"
        )
        fontGlyphs.add(glyph)
    }

    //   // >
    //   <glyph d="M370 342L36 155L36 205L278 342L36 478L36 528L370 342Z" glyph-name="uni3e"
    //   horiz-adv-x="406" unicode="&#x3e;" vert-adv-y="1000" />
    fun addGraterThan(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni3e",
            406,
            "&#x3e;"
        )
        fontGlyphs.add(glyph)
    }

    //   // ?
    //   <glyph
    //   d="M394.50 648.50Q394.50 648.50 419.25 623.75Q444 599 444 530Q444 461 394.50 411.50Q345 362 276 362L225 362L225 317L113 317L113 698L276 698Q345 698 394.50 648.50M82 317L47 317L47 698L82 698L82 317M260.50 204.50Q260.50 204.50 279.75 185.25Q299 166 299 112Q299 58 260.50 19Q222-20 168-20Q138-20 113-8L113 232Q140 243 168 243Q222 243 260.50 204.50M82 11Q36 51 36 112Q36 172 82 212L82 11Z"
    //   glyph-name="uni3f" horiz-adv-x="480" unicode="&#x3f;" vert-adv-y="1000" />
    fun addQuestion(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni3f",
            480,
            "&#x3f;"
        )
        fontGlyphs.add(glyph)
    }

    //   // @
    //   <glyph
    //   d="M758 424Q758 387 745.50 343Q733 299 709.50 256.50Q686 214 645 186Q604 158 555 158Q514 158 490 182Q466 206 465 252Q408 160 344 160Q284 160 248.50 196.50Q213 233 213 297Q213 382 275 452.50Q337 523 423 523Q512 523 512 429L537 513L621 513L551 261Q544 235 544 223Q544 203 553 191Q562 179 578 179Q642 179 689 256Q736 333 736 423Q736 539 657 610Q578 681 455 681Q308 681 207.50 574.50Q107 468 107 315Q107 177 191.50 96.50Q276 16 421 16Q547 16 682 100L694 82Q570-8 422-8Q243-8 139.50 83Q36 174 36 326Q36 485 157.50 595.50Q279 706 445 706Q586 706 672 628Q758 550 758 424M491 442Q491 466 480.50 482Q470 498 450 498Q411 498 377.50 449.50Q344 401 327.50 345Q311 289 311 250Q311 185 361 185Q390 185 416.50 220Q443 255 458 302Q473 349 482 388Q491 427 491 442Z"
    //   glyph-name="uni40" horiz-adv-x="794" unicode="&#x40;" vert-adv-y="1000" />
    fun addAtSign(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni40",
            794,
            "&#x40;"
        )
        fontGlyphs.add(glyph)
    }

    //   // A
    //   <glyph
    //   d="M900 0L612 0L398 697L614 697L851 32L900 32L900 0M579 0L480 0L480 32L524 32L467 214L191 214L114 32L195 32L195 0L36 0L36 32L80 32L328 665L215 665L215 697L365 697L579 0M458 246L344 618L198 246L458 246Z"
    //   glyph-name="uni41" horiz-adv-x="936" unicode="&#x41;" vert-adv-y="1000" />
    fun addUpperA(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni41",
            936,
            "&#x41;"
        )
        fontGlyphs.add(glyph)
    }

    //   // B
    //   <glyph
    //   d="M716 182Q716 108 662 54Q608 0 534 0L171 0L171 697L504 697Q581 697 633.50 642.50Q686 588 686 511Q686 461 660.50 420Q635 379 590 355Q646 337 681 289Q716 241 716 182M610.50 408.50Q610.50 408.50 632.75 430.75Q655 453 655 515Q655 577 610.50 621Q566 665 504 665L357 665L357 364L504 364Q566 364 610.50 408.50M640 76Q640 76 662 98Q684 120 684 182Q684 244 640 289Q596 334 534 334L357 334L357 32L534 32Q596 32 640 76M139 0L36 0L36 32L103 32L103 665L36 665L36 697L139 697L139 0Z"
    //   glyph-name="uni42" horiz-adv-x="752" unicode="&#x42;" vert-adv-y="1000" />
    fun addUpperB(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni42",
            752,
            "&#x42;"
        )
        fontGlyphs.add(glyph)
    }

    //   // C
    //   <glyph
    //   d="M736 16L705 16L705 148Q655 72 573.50 28Q492-16 401-16Q323-16 251.50 16.50Q180 49 128 108L128 592Q180 650 251.50 682.50Q323 715 400 715Q492 715 573.50 671Q655 627 704 551L704 681L736 681L736 497L701 497Q658 582 577 632.50Q496 683 401 683Q371 683 347 679L347 20Q371 16 400 16Q495 16 576.50 66.50Q658 117 700 203L736 203L736 16M96 148Q36 238 36 350Q36 460 96 551L96 148Z"
    //   glyph-name="uni43" horiz-adv-x="772" unicode="&#x43;" vert-adv-y="1000" />
    fun addUpperC(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni43",
            772,
            "&#x43;"
        )
        fontGlyphs.add(glyph)
    }

    //   // D
    //   <glyph
    //   d="M647.50 595Q647.50 595 698.75 544Q750 493 750 349Q750 205 648 102.50Q546 0 402 0L170 0L170 697L401 697Q545 697 647.50 595M625.50 125Q625.50 125 672.25 171.50Q719 218 719 349Q719 480 625.50 572.50Q532 665 402 665L357 665L357 32L401 32Q532 32 625.50 125M139 0L36 0L36 32L102 32L102 665L36 665L36 697L139 697L139 0Z"
    //   glyph-name="uni44" horiz-adv-x="786" unicode="&#x44;" vert-adv-y="1000" />
    fun addUpperD(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni44",
            786,
            "&#x44;"
        )
        fontGlyphs.add(glyph)
    }

    //   // E
    //   <glyph
    //   d="M656 0L182 0L182 697L656 697L656 569L624 569L624 665L370 665L370 355L498 355L498 324L370 324L370 32L623 32L623 129L656 129L656 0M150 0L36 0L36 32L115 32L115 665L36 665L36 697L150 697L150 0Z"
    //   glyph-name="uni45" horiz-adv-x="692" unicode="&#x45;" vert-adv-y="1000" />
    fun addUpperE(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni45",
            692,
            "&#x45;"
        )
        fontGlyphs.add(glyph)
    }

    //   // F
    //   <glyph
    //   d="M655 569L623 569L623 665L370 665L370 355L497 355L497 324L370 324L370 32L458 32L458 0L181 0L181 697L655 697L655 569M149 0L44 0L44 32L114 32L114 665L36 665L36 697L149 697L149 0Z"
    //   glyph-name="uni46" horiz-adv-x="691" unicode="&#x46;" vert-adv-y="1000" />
    fun addUpperF(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni46",
            691,
            "&#x46;"
        )
        fontGlyphs.add(glyph)
    }

    //   // G
    //   <glyph
    //   d="M735 2L704 2L704 148Q654 72 573 28Q492-16 400-16Q243-16 133 102L133 597Q242 715 400 715Q492 715 573 671Q654 627 704 551L704 681L735 681L735 494L700 494Q659 580 577.50 631.50Q496 683 401 683Q371 683 347 679L347 20Q370 16 399 16Q497 16 580 69.50Q663 123 704 213L704 325L608 325L608 355L735 355L735 2M102 141Q36 235 36 350Q36 464 102 559L102 141Z"
    //   glyph-name="uni47" horiz-adv-x="771" unicode="&#x47;" vert-adv-y="1000" />
    fun addUpperG(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni47",
            771,
            "&#x47;"
        )
        fontGlyphs.add(glyph)
    }

    //   // H
    //   <glyph
    //   d="M772 0L590 0L590 32L666 32L666 325L360 325L360 32L451 32L451 0L175 0L175 697L451 697L451 665L360 665L360 355L666 355L666 665L590 665L590 697L772 697L772 665L696 665L696 32L772 32L772 0M143 0L36 0L36 32L107 32L107 665L36 665L36 697L143 697L143 0Z"
    //   glyph-name="uni48" horiz-adv-x="808" unicode="&#x48;" vert-adv-y="1000" />
    fun addUpperH(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni48",
            808,
            "&#x48;"
        )
        fontGlyphs.add(glyph)
    }

    //   // I
    //   <glyph
    //   d="M451 0L170 0L170 697L451 697L451 665L360 665L360 32L451 32L451 0M140 0L36 0L36 32L107 32L107 665L36 665L36 697L140 697L140 0Z"
    //   glyph-name="uni49" horiz-adv-x="487" unicode="&#x49;" vert-adv-y="1000" />
    fun addUpperI(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni49",
            487,
            "&#x49;"
        )
        fontGlyphs.add(glyph)
    }

    //   // J
    //   <glyph
    //   d="M566 665L508 665L508 267Q508 177 453.50 105.50Q399 34 312 10L312 697L566 697L566 665M282 3Q264 0 244 0L36 0L36 222L68 222L68 32L247 32L247 665L188 665L188 697L282 697L282 3Z"
    //   glyph-name="uni4a" horiz-adv-x="602" unicode="&#x4a;" vert-adv-y="1000" />
    fun addUpperJ(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni4a",
            602,
            "&#x4a;"
        )
        fontGlyphs.add(glyph)
    }

    //   // K
    //   <glyph
    //   d="M788 0L605 0L605 32L702 32L435 339L703 665L605 665L605 697L788 697L788 665L744 665L477 341L743 32L788 32L788 0M450 0L172 0L172 697L451 697L451 665L360 665L360 32L450 32L450 0M141 0L36 0L36 32L107 32L107 665L36 665L36 697L141 697L141 0Z"
    //   glyph-name="uni4b" horiz-adv-x="824" unicode="&#x4b;" vert-adv-y="1000" />
    fun addUpperK(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni4b",
            824,
            "&#x4b;"
        )
        fontGlyphs.add(glyph)
    }

    //   // L
    //   <glyph
    //   d="M601 0L186 0L186 697L453 697L453 665L372 665L372 32L569 32L569 232L601 232L601 0M154 0L40 0L40 32L118 32L118 665L36 665L36 697L154 697L154 0Z"
    //   glyph-name="uni4c" horiz-adv-x="637" unicode="&#x4c;" vert-adv-y="1000" />
    fun addUpperL(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni4c",
            637,
            "&#x4c;"
        )
        fontGlyphs.add(glyph)
    }

    //   // M
    //   <glyph
    //   d="M1018 665L940 665L940 32L1017 32L1017 0L834 0L834 32L909 32L909 656L643 181L372 662L372 32L453 32L453 0L185 0L185 697L388 697L642 246L896 697L1018 697L1018 665M154 0L36 0L36 32L117 32L117 665L36 665L36 697L154 697L154 0Z"
    //   glyph-name="uni4d" horiz-adv-x="1054" unicode="&#x4d;" vert-adv-y="1000" />
    fun addUpperM(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni4d",
            1054,
            "&#x4d;"
        )
        fontGlyphs.add(glyph)
    }

    //   // N
    //   <glyph
    //   d="M832 665L756 665L756 0L731 0L372 635L372 32L453 32L453 0L187 0L187 697L373 697L725 76L725 665L649 665L649 697L832 697L832 665M156 0L36 0L36 32L118 32L118 665L36 665L36 697L156 697L156 0Z"
    //   glyph-name="uni4e" horiz-adv-x="868" unicode="&#x4e;" vert-adv-y="1000" />
    fun addUpperN(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni4e",
            868,
            "&#x4e;"
        )
        fontGlyphs.add(glyph)
    }

    //   // O
    //   <glyph
    //   d="M770 346Q770 194 662 86.50Q554-21 403-21Q247-21 140 91L140 601Q247 713 402 713Q554 713 662 605Q770 497 770 346M738 346Q738 484 639 583Q540 682 403 682Q379 682 347 677L347 15Q394 10 402 10Q541 10 639.50 108.50Q738 207 738 346M108 128Q36 227 36 346Q36 465 108 565L108 128Z"
    //   glyph-name="uni4f" horiz-adv-x="806" unicode="&#x4f;" vert-adv-y="1000" />
    fun addUpperO(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni4f",
            806,
            "&#x4f;"
        )
        fontGlyphs.add(glyph)
    }

    //   // P
    //   <glyph
    //   d="M638.50 634Q638.50 634 670.25 602.50Q702 571 702 482Q702 393 639 330Q576 267 487 267L372 267L372 32L454 32L454 0L188 0L188 697L486 697Q575 697 638.50 634M616 352.50Q616 352.50 643 379.25Q670 406 670 482Q670 558 616 611.50Q562 665 487 665L372 665L372 299L486 299Q562 299 616 352.50M156 0L36 0L36 32L118 32L118 665L51 665L51 697L156 697L156 0Z"
    //   glyph-name="uni50" horiz-adv-x="738" unicode="&#x50;" vert-adv-y="1000" />
    fun addUpperP(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni50",
            738,
            "&#x50;"
        )
        fontGlyphs.add(glyph)
    }

    //   // Q
    //   <glyph
    //   d="M662 605Q662 605 716 551Q770 497 770 346Q770 195 661 86Q728 13 750-87L718-87Q696 1 638 65Q537-21 402-21Q248-21 140 92L140 601Q249 713 402 713Q554 713 662 605M639 108Q738 207 738 346Q738 485 640 583Q542 681 402 681Q371 681 347 677L347 15Q392 10 402 10Q520 10 616 87Q520 174 391 174L391 206Q533 206 639 108M108 128Q36 227 36 346Q36 466 108 563L108 128Z"
    //   glyph-name="uni51" horiz-adv-x="806" unicode="&#x51;" vert-adv-y="1000" />
    fun addUpperQ(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni51",
            806,
            "&#x51;"
        )
        fontGlyphs.add(glyph)
    }

    //   // R
    //   <glyph
    //   d="M767 0L585 0L585 32L678 32L465 303L497 303Q576 303 625.50 351Q675 399 675 477Q675 556 625.50 610.50Q576 665 498 665L372 665L372 32L454 32L454 0L187 0L187 697L497 697Q585 697 648 634.50Q711 572 711 484Q711 405 658 345Q605 285 527 274L716 32L767 32L767 0M155 0L36 0L36 32L118 32L118 665L43 665L43 697L155 697L155 0Z"
    //   glyph-name="uni52" horiz-adv-x="803" unicode="&#x52;" vert-adv-y="1000" />
    fun addUpperR(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni52",
            803,
            "&#x52;"
        )
        fontGlyphs.add(glyph)
    }

    //   // S
    //   <glyph
    //   d="M595 213Q595 155 566 105L38 439Q36 463 36 474Q36 577 121.50 641Q207 705 313 705Q450 705 542 599L542 675L574 675L574 544L545 544Q504 605 444 639Q384 673 313 673Q209 673 134 612L493 391Q541 361 568 315Q595 269 595 213M548 79Q509 32 446 5.50Q383-21 318-21Q178-21 81 85L81 8L49 8L49 141L77 140Q118 80 182 45Q246 10 318 10Q420 10 496 72L137 292Q78 329 50 394L548 79Z"
    //   glyph-name="uni53" horiz-adv-x="631" unicode="&#x53;" vert-adv-y="1000" />
    fun addUpperS(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni53",
            631,
            "&#x53;"
        )
        fontGlyphs.add(glyph)
    }

    //   // T
    //   <glyph
    //   d="M732 506L701 506L701 665L511 665L511 32L592 32L592 0L322 0L322 697L732 697L732 506M290 0L175 0L175 32L257 32L257 665L68 665L68 506L36 506L36 697L290 697L290 0Z"
    //   glyph-name="uni54" horiz-adv-x="768" unicode="&#x54;" vert-adv-y="1000" />
    fun addUpperT(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni54",
            768,
            "&#x54;"
        )
        fontGlyphs.add(glyph)
    }

    //   // U
    //   <glyph
    //   d="M785 665L708 665L708 286Q708 162 619 73Q530-16 406-16Q339-16 279 12.50Q219 41 176 92L176 697L443 697L443 665L380 665L380 17Q384 17 393 16.50Q402 16 406 16Q518 16 597.50 95Q677 174 677 286L677 665L603 665L603 697L785 697L785 665M145 137Q105 204 105 286L105 665L36 665L36 697L145 697L145 137Z"
    //   glyph-name="uni55" horiz-adv-x="821" unicode="&#x55;" vert-adv-y="1000" />
    fun addUpperU(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni55",
            821,
            "&#x55;"
        )
        fontGlyphs.add(glyph)
    }

    //   // V
    //   <glyph
    //   d="M836 665L755 665L518 0L409 0L163 697L442 697L442 665L353 665L535 149L723 665L654 665L654 697L836 697L836 665M376 0L331 0L96 665L36 665L36 697L130 697L376 0Z"
    //   glyph-name="uni56" horiz-adv-x="872" unicode="&#x56;" vert-adv-y="1000" />
    fun addUpperV(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni56",
            872,
            "&#x56;"
        )
        fontGlyphs.add(glyph)
    }

    //   // W
    //   <glyph
    //   d="M1166 665L1109 665L864 0L835 1L682 439L519 0L408 0L161 697L444 697L444 665L353 665L536 146L665 485L603 665L549 665L549 697L732 697L732 665L635 665L849 52L1075 665L983 665L983 697L1166 697L1166 665M375 0L332 0L97 665L36 665L36 697L128 697L375 0Z"
    //   glyph-name="uni57" horiz-adv-x="1202" unicode="&#x57;" vert-adv-y="1000" />
    fun addUpperW(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni57",
            1202,
            "&#x57;"
        )
        fontGlyphs.add(glyph)
    }

    //   // X
    //   <glyph
    //   d="M771 665L679 665L524 345L684 32L744 32L744 0L495 0L142 697L448 697L448 665L362 665L506 380L645 665L589 665L589 697L771 697L771 665M460 0L346 0L346 32L408 32L270 304L132 32L198 32L198 0L36 0L36 32L97 32L252 339L87 665L41 665L41 697L107 697L460 0Z"
    //   glyph-name="uni58" horiz-adv-x="807" unicode="&#x58;" vert-adv-y="1000" />
    fun addUpperX(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni58",
            807,
            "&#x58;"
        )
        fontGlyphs.add(glyph)
    }

    //   // Y
    //   <glyph
    //   d="M800 665L744 665L546 283L546 32L635 32L635 0L355 0L355 282L145 697L464 697L464 665L365 665L537 335L709 665L623 665L623 697L800 697L800 665M323 0L221 0L221 32L290 32L290 259L80 665L36 665L36 697L110 697L323 274L323 0Z"
    //   glyph-name="uni59" horiz-adv-x="836" unicode="&#x59;" vert-adv-y="1000" />
    fun addUpperY(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni59",
            836,
            "&#x59;"
        )
        fontGlyphs.add(glyph)
    }

    //   // Z
    //   <glyph
    //   d="M642 697L344 32L598 32L598 136L631 136L631 0L112 0L421 697L642 697M388 697L78 0L36 0L335 665L78 665L78 569L45 569L45 697L388 697Z"
    //   glyph-name="uni5a" horiz-adv-x="678" unicode="&#x5a;" vert-adv-y="1000" />
    fun addUpperZ(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni5a",
            678,
            "&#x5a;"
        )
        fontGlyphs.add(glyph)
    }

    //   // [ square bracket
    //   <glyph
    //   d="M404-155L112-155L112 765L404 765L404 733L323 733L323-123L404-123L404-155M80-155L36-155L36 765L80 765L80-155Z"
    //   glyph-name="uni5b" horiz-adv-x="440" unicode="&#x5b;" vert-adv-y="1000" />
    fun addSquareBraOp(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni5b",
            440,
            "&#x5b;"
        )
        fontGlyphs.add(glyph)
    }

    //   // \
    //   <glyph d="M390-199L36 801L164 801L518-199L390-199Z" glyph-name="uni5c" horiz-adv-x="554"
    //   unicode="&#x5c;" vert-adv-y="1000" />
    fun addBackSlash(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni5c",
            554,
            "&#x5c;"
        )
        fontGlyphs.add(glyph)
    }

    //   // ] square bracket
    //   <glyph
    //   d="M404-155L192-155L192 765L404 765L404-155M161-155L36-155L36-123L119-123L119 733L36 733L36 765L161 765L161-155Z"
    //   glyph-name="uni5d" horiz-adv-x="440" unicode="&#x5d;" vert-adv-y="1000" />
    fun addSquareBraEd(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni5d",
            440,
            "&#x5d;"
        )
        fontGlyphs.add(glyph)
    }

    //   // ^
    //   <glyph d="M409 408L359 408L223 651L86 408L36 408L198 697L248 697L409 408Z"
    //   glyph-name="uni5e" horiz-adv-x="445" unicode="&#x5e;" vert-adv-y="1000" />
    fun addCaret(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni5e",
            445,
            "&#x5e;"
        )
        fontGlyphs.add(glyph)
    }

    //   // _
    //   <glyph d="M500-36L0-36L0-5L500-5L500-36Z" glyph-name="uni5f" horiz-adv-x="500"
    //   unicode="&#x5f;" vert-adv-y="1000" />
    fun addUnderbar(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni5f",
            500,
            "&#x5f;"
        )
        fontGlyphs.add(glyph)
    }

    //   // `
    //   <glyph d="M243 745L232 715L36 787L46 816L243 745Z" glyph-name="uni60" horiz-adv-x="279"
    //   unicode="&#x60;" vert-adv-y="1000" />
    fun addBackQuo(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni60",
            279,
            "&#x60;"
        )
        fontGlyphs.add(glyph)
    }

    //   // a
    //   <glyph
    //   d="M900 0L612 0L398 697L614 697L851 32L900 32L900 0M579 0L480 0L480 32L524 32L467 214L191 214L114 32L195 32L195 0L36 0L36 32L80 32L328 665L215 665L215 697L365 697L579 0M458 246L344 618L198 246L458 246Z"
    //   glyph-name="uni61" horiz-adv-x="936" unicode="&#x61;" vert-adv-y="1000" />
    fun addLowerA(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni61",
            936,
            "&#x61;"
        )
        fontGlyphs.add(glyph)
    }

    //   // b
    //   <glyph
    //   d="M716 182Q716 108 662 54Q608 0 534 0L171 0L171 697L504 697Q581 697 633.50 642.50Q686 588 686 511Q686 461 660.50 420Q635 379 590 355Q646 337 681 289Q716 241 716 182M610.50 408.50Q610.50 408.50 632.75 430.75Q655 453 655 515Q655 577 610.50 621Q566 665 504 665L357 665L357 364L504 364Q566 364 610.50 408.50M640 76Q640 76 662 98Q684 120 684 182Q684 244 640 289Q596 334 534 334L357 334L357 32L534 32Q596 32 640 76M139 0L36 0L36 32L103 32L103 665L36 665L36 697L139 697L139 0Z"
    //   glyph-name="uni62" horiz-adv-x="752" unicode="&#x62;" vert-adv-y="1000" />
    fun addLowerB(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni62",
            752,
            "&#x62;"
        )
        fontGlyphs.add(glyph)
    }

    //   // c
    //   <glyph
    //   d="M736 16L705 16L705 148Q655 72 573.50 28Q492-16 401-16Q323-16 251.50 16.50Q180 49 128 108L128 592Q180 650 251.50 682.50Q323 715 400 715Q492 715 573.50 671Q655 627 704 551L704 681L736 681L736 497L701 497Q658 582 577 632.50Q496 683 401 683Q371 683 347 679L347 20Q371 16 400 16Q495 16 576.50 66.50Q658 117 700 203L736 203L736 16M96 148Q36 238 36 350Q36 460 96 551L96 148Z"
    //   glyph-name="uni63" horiz-adv-x="772" unicode="&#x63;" vert-adv-y="1000" />
    fun addLowerC(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni63",
            772,
            "&#x63;"
        )
        fontGlyphs.add(glyph)
    }

    //   // d
    //   <glyph
    //   d="M647.50 595Q647.50 595 698.75 544Q750 493 750 349Q750 205 648 102.50Q546 0 402 0L170 0L170 697L401 697Q545 697 647.50 595M625.50 125Q625.50 125 672.25 171.50Q719 218 719 349Q719 480 625.50 572.50Q532 665 402 665L357 665L357 32L401 32Q532 32 625.50 125M139 0L36 0L36 32L102 32L102 665L36 665L36 697L139 697L139 0Z"
    //   glyph-name="uni64" horiz-adv-x="786" unicode="&#x64;" vert-adv-y="1000" />
    fun addLowerD(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni64",
            786,
            "&#x64;"
        )
        fontGlyphs.add(glyph)
    }

    //   // e
    //   <glyph
    //   d="M656 0L182 0L182 697L656 697L656 569L624 569L624 665L370 665L370 355L498 355L498 324L370 324L370 32L623 32L623 129L656 129L656 0M150 0L36 0L36 32L115 32L115 665L36 665L36 697L150 697L150 0Z"
    //   glyph-name="uni65" horiz-adv-x="692" unicode="&#x65;" vert-adv-y="1000" />
    fun addLowerE(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni65",
            692,
            "&#x65;"
        )
        fontGlyphs.add(glyph)
    }

    //   // f
    //   <glyph
    //   d="M655 569L623 569L623 665L370 665L370 355L497 355L497 324L370 324L370 32L458 32L458 0L181 0L181 697L655 697L655 569M149 0L44 0L44 32L114 32L114 665L36 665L36 697L149 697L149 0Z"
    //   glyph-name="uni66" horiz-adv-x="691" unicode="&#x66;" vert-adv-y="1000" />
    fun addLowerF(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni66",
            691,
            "&#x66;"
        )
        fontGlyphs.add(glyph)
    }

    //   // g
    //   <glyph
    //   d="M735 2L704 2L704 148Q654 72 573 28Q492-16 400-16Q243-16 133 102L133 597Q242 715 400 715Q492 715 573 671Q654 627 704 551L704 681L735 681L735 494L700 494Q659 580 577.50 631.50Q496 683 401 683Q371 683 347 679L347 20Q370 16 399 16Q497 16 580 69.50Q663 123 704 213L704 325L608 325L608 355L735 355L735 2M102 141Q36 235 36 350Q36 464 102 559L102 141Z"
    //   glyph-name="uni67" horiz-adv-x="771" unicode="&#x67;" vert-adv-y="1000" />
    fun addLowerG(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni67",
            771,
            "&#x67;"
        )
        fontGlyphs.add(glyph)
    }

    //   // h
    //   <glyph
    //   d="M772 0L590 0L590 32L666 32L666 325L360 325L360 32L451 32L451 0L175 0L175 697L451 697L451 665L360 665L360 355L666 355L666 665L590 665L590 697L772 697L772 665L696 665L696 32L772 32L772 0M143 0L36 0L36 32L107 32L107 665L36 665L36 697L143 697L143 0Z"
    //   glyph-name="uni68" horiz-adv-x="808" unicode="&#x68;" vert-adv-y="1000" />
    fun addLowerH(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni68",
            808,
            "&#x68;"
        )
        fontGlyphs.add(glyph)
    }

    //   // i
    //   <glyph
    //   d="M451 0L170 0L170 697L451 697L451 665L360 665L360 32L451 32L451 0M140 0L36 0L36 32L107 32L107 665L36 665L36 697L140 697L140 0Z"
    //   glyph-name="uni69" horiz-adv-x="487" unicode="&#x69;" vert-adv-y="1000" />
    fun addLowerI(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni69",
            487,
            "&#x69;"
        )
        fontGlyphs.add(glyph)
    }

    //   // j
    //   <glyph
    //   d="M566 665L508 665L508 267Q508 177 453.50 105.50Q399 34 312 10L312 697L566 697L566 665M282 3Q264 0 244 0L36 0L36 222L68 222L68 32L247 32L247 665L188 665L188 697L282 697L282 3Z"
    //   glyph-name="uni6a" horiz-adv-x="602" unicode="&#x6a;" vert-adv-y="1000" />
    fun addLowerJ(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni6a",
            602,
            "&#x6a;"
        )
        fontGlyphs.add(glyph)
    }

    //   // k
    //   <glyph
    //   d="M788 0L605 0L605 32L702 32L435 339L703 665L605 665L605 697L788 697L788 665L744 665L477 341L743 32L788 32L788 0M450 0L172 0L172 697L451 697L451 665L360 665L360 32L450 32L450 0M141 0L36 0L36 32L107 32L107 665L36 665L36 697L141 697L141 0Z"
    //   glyph-name="uni6b" horiz-adv-x="824" unicode="&#x6b;" vert-adv-y="1000" />
    fun addLowerK(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni6b",
            824,
            "&#x6b;"
        )
        fontGlyphs.add(glyph)
    }

    //   // l
    //   <glyph
    //   d="M601 0L186 0L186 697L453 697L453 665L372 665L372 32L569 32L569 232L601 232L601 0M154 0L40 0L40 32L118 32L118 665L36 665L36 697L154 697L154 0Z"
    //   glyph-name="uni6c" horiz-adv-x="637" unicode="&#x6c;" vert-adv-y="1000" />
    fun addLowerL(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni6c",
            637,
            "&#x6c;"
        )
        fontGlyphs.add(glyph)
    }

    //   // m
    //   <glyph
    //   d="M1018 665L940 665L940 32L1017 32L1017 0L834 0L834 32L909 32L909 656L643 181L372 662L372 32L453 32L453 0L185 0L185 697L388 697L642 246L896 697L1018 697L1018 665M154 0L36 0L36 32L117 32L117 665L36 665L36 697L154 697L154 0Z"
    //   glyph-name="uni6d" horiz-adv-x="1054" unicode="&#x6d;" vert-adv-y="1000" />
    fun addLowerM(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni6d",
            1054,
            "&#x6d;"
        )
        fontGlyphs.add(glyph)
    }

    //   // n
    //   <glyph
    //   d="M832 665L756 665L756 0L731 0L372 635L372 32L453 32L453 0L187 0L187 697L373 697L725 76L725 665L649 665L649 697L832 697L832 665M156 0L36 0L36 32L118 32L118 665L36 665L36 697L156 697L156 0Z"
    //   glyph-name="uni6e" horiz-adv-x="868" unicode="&#x6e;" vert-adv-y="1000" />
    fun addLowerN(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni6e",
            868,
            "&#x6e;"
        )
        fontGlyphs.add(glyph)
    }

    //   // o
    //   <glyph
    //   d="M770 346Q770 194 662 86.50Q554-21 403-21Q247-21 140 91L140 601Q247 713 402 713Q554 713 662 605Q770 497 770 346M738 346Q738 484 639 583Q540 682 403 682Q379 682 347 677L347 15Q394 10 402 10Q541 10 639.50 108.50Q738 207 738 346M108 128Q36 227 36 346Q36 465 108 565L108 128Z"
    //   glyph-name="uni6f" horiz-adv-x="806" unicode="&#x6f;" vert-adv-y="1000" />
    fun addLowerO(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni6f",
            806,
            "&#x6f;"
        )
        fontGlyphs.add(glyph)
    }

    //   // p
    //   <glyph
    //   d="M638.50 634Q638.50 634 670.25 602.50Q702 571 702 482Q702 393 639 330Q576 267 487 267L372 267L372 32L454 32L454 0L188 0L188 697L486 697Q575 697 638.50 634M616 352.50Q616 352.50 643 379.25Q670 406 670 482Q670 558 616 611.50Q562 665 487 665L372 665L372 299L486 299Q562 299 616 352.50M156 0L36 0L36 32L118 32L118 665L51 665L51 697L156 697L156 0Z"
    //   glyph-name="uni70" horiz-adv-x="738" unicode="&#x70;" vert-adv-y="1000" />
    fun addLowerP(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni70",
            738,
            "&#x70;"
        )
        fontGlyphs.add(glyph)
    }

    //   // q
    //   <glyph
    //   d="M662 605Q662 605 716 551Q770 497 770 346Q770 195 661 86Q728 13 750-87L718-87Q696 1 638 65Q537-21 402-21Q248-21 140 92L140 601Q249 713 402 713Q554 713 662 605M639 108Q738 207 738 346Q738 485 640 583Q542 681 402 681Q371 681 347 677L347 15Q392 10 402 10Q520 10 616 87Q520 174 391 174L391 206Q533 206 639 108M108 128Q36 227 36 346Q36 466 108 563L108 128Z"
    //   glyph-name="uni71" horiz-adv-x="806" unicode="&#x71;" vert-adv-y="1000" />
    fun addLowerQ(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni71",
            806,
            "&#x71;"
        )
        fontGlyphs.add(glyph)
    }

    //   // r
    //   <glyph
    //   d="M767 0L585 0L585 32L678 32L465 303L497 303Q576 303 625.50 351Q675 399 675 477Q675 556 625.50 610.50Q576 665 498 665L372 665L372 32L454 32L454 0L187 0L187 697L497 697Q585 697 648 634.50Q711 572 711 484Q711 405 658 345Q605 285 527 274L716 32L767 32L767 0M155 0L36 0L36 32L118 32L118 665L43 665L43 697L155 697L155 0Z"
    //   glyph-name="uni72" horiz-adv-x="803" unicode="&#x72;" vert-adv-y="1000" />
    fun addLowerR(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni72",
            803,
            "&#x72;"
        )
        fontGlyphs.add(glyph)
    }

    //   // s
    //   <glyph
    //   d="M595 213Q595 155 566 105L38 439Q36 463 36 474Q36 577 121.50 641Q207 705 313 705Q450 705 542 599L542 675L574 675L574 544L545 544Q504 605 444 639Q384 673 313 673Q209 673 134 612L493 391Q541 361 568 315Q595 269 595 213M548 79Q509 32 446 5.50Q383-21 318-21Q178-21 81 85L81 8L49 8L49 141L77 140Q118 80 182 45Q246 10 318 10Q420 10 496 72L137 292Q78 329 50 394L548 79Z"
    //   glyph-name="uni73" horiz-adv-x="631" unicode="&#x73;" vert-adv-y="1000" />
    fun addLowerS(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni73",
            631,
            "&#x73;"
        )
        fontGlyphs.add(glyph)
    }

    //   // t
    //   <glyph
    //   d="M732 506L701 506L701 665L511 665L511 32L592 32L592 0L322 0L322 697L732 697L732 506M290 0L175 0L175 32L257 32L257 665L68 665L68 506L36 506L36 697L290 697L290 0Z"
    //   glyph-name="uni74" horiz-adv-x="768" unicode="&#x74;" vert-adv-y="1000" />
    fun addLowerT(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni74",
            768,
            "&#x74;"
        )
        fontGlyphs.add(glyph)
    }

    //   // u
    //   <glyph
    //   d="M785 665L708 665L708 286Q708 162 619 73Q530-16 406-16Q339-16 279 12.50Q219 41 176 92L176 697L443 697L443 665L380 665L380 17Q384 17 393 16.50Q402 16 406 16Q518 16 597.50 95Q677 174 677 286L677 665L603 665L603 697L785 697L785 665M145 137Q105 204 105 286L105 665L36 665L36 697L145 697L145 137Z"
    //   glyph-name="uni75" horiz-adv-x="821" unicode="&#x75;" vert-adv-y="1000" />
    fun addLowerU(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni75",
            821,
            "&#x75;"
        )
        fontGlyphs.add(glyph)
    }

    //   // v
    //   <glyph
    //   d="M836 665L755 665L518 0L409 0L163 697L442 697L442 665L353 665L535 149L723 665L654 665L654 697L836 697L836 665M376 0L331 0L96 665L36 665L36 697L130 697L376 0Z"
    //   glyph-name="uni76" horiz-adv-x="872" unicode="&#x76;" vert-adv-y="1000" />
    fun addLowerV(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni76",
            872,
            "&#x76;"
        )
        fontGlyphs.add(glyph)
    }

    //   // w
    //   <glyph
    //   d="M1166 665L1109 665L864 0L835 1L682 439L519 0L408 0L161 697L444 697L444 665L353 665L536 146L665 485L603 665L549 665L549 697L732 697L732 665L635 665L849 52L1075 665L983 665L983 697L1166 697L1166 665M375 0L332 0L97 665L36 665L36 697L128 697L375 0Z"
    //   glyph-name="uni77" horiz-adv-x="1202" unicode="&#x77;" vert-adv-y="1000" />
    fun addLowerW(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni77",
            1202,
            "&#x77;"
        )
        fontGlyphs.add(glyph)
    }

    //   // x
    //   <glyph
    //   d="M771 665L679 665L524 345L684 32L744 32L744 0L495 0L142 697L448 697L448 665L362 665L506 380L645 665L589 665L589 697L771 697L771 665M460 0L346 0L346 32L408 32L270 304L132 32L198 32L198 0L36 0L36 32L97 32L252 339L87 665L41 665L41 697L107 697L460 0Z"
    //   glyph-name="uni78" horiz-adv-x="807" unicode="&#x78;" vert-adv-y="1000" />
    fun addLowerX(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni78",
            807,
            "&#x78;"
        )
        fontGlyphs.add(glyph)
    }

    //   // y
    //   <glyph
    //   d="M800 665L744 665L546 283L546 32L635 32L635 0L355 0L355 282L145 697L464 697L464 665L365 665L537 335L709 665L623 665L623 697L800 697L800 665M323 0L221 0L221 32L290 32L290 259L80 665L36 665L36 697L110 697L323 274L323 0Z"
    //   glyph-name="uni79" horiz-adv-x="836" unicode="&#x79;" vert-adv-y="1000" />
    fun addLowerY(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni79",
            836,
            "&#x79;"
        )
        fontGlyphs.add(glyph)
    }

    //   // z
    //   <glyph
    //   d="M642 697L344 32L598 32L598 136L631 136L631 0L112 0L421 697L642 697M388 697L78 0L36 0L335 665L78 665L78 569L45 569L45 697L388 697Z"
    //   glyph-name="uni7a" horiz-adv-x="678" unicode="&#x7a;" vert-adv-y="1000" />
    fun addLowerZ(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni7a",
            678,
            "&#x7a;"
        )
        fontGlyphs.add(glyph)
    }

    //   // {
    //   <glyph
    //   d="M427-180L343-180Q324-180 304-177L304 749Q324 752 343 752L427 752L427 720L340 720L340 312L311 286L340 260L340-149L427-149L427-180M274-170Q188-146 133.50-74.50Q79-3 79 87L79 270L36 270L36 302L79 302L79 485Q79 575 133.50 646.50Q188 718 274 742L274-170Z"
    //   glyph-name="uni7b" horiz-adv-x="463" unicode="&#x7b;" vert-adv-y="1000" />
    fun addCurlyBraOp(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni7b",
            463,
            "&#x7b;"
        )
        fontGlyphs.add(glyph)
    }

    //   // | vertical bar
    //   <glyph d="M166-199L36-199L36 801L166 801L166-199Z" glyph-name="uni7c" horiz-adv-x="202"
    //   unicode="&#x7c;" vert-adv-y="1000" />
    fun addVeticalBar(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni7c",
            202,
            "&#x7c;"
        )
        fontGlyphs.add(glyph)
    }

    //   // } curly brackets
    //   <glyph
    //   d="M120-180L36-180L36-149L123-149L123 260L152 286L123 312L123 720L36 720L36 752L120 752Q140 752 159 749L159-177Q140-180 120-180M189-170L189 742Q275 718 329.50 646.50Q384 575 384 485L384 302L427 302L427 270L384 270L384 87Q384-3 329.50-74.50Q275-146 189-170Z"
    //   glyph-name="uni7d" horiz-adv-x="463" unicode="&#x7d;" vert-adv-y="1000" />
    fun addCurlyBraEd(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni7d",
            463,
            "&#x7d;"
        )
        fontGlyphs.add(glyph)
    }

    //   // ~
    //   <glyph
    //   d="M428 450Q391 401 330 393Q269 384 218 422Q185 446 143 441Q102 435 75 401L36 433Q76 482 137 490Q204 497 248 461Q281 434 322 441Q364 446 389 480L428 450Z"
    //   glyph-name="uni7e" horiz-adv-x="464" unicode="&#x7e;" vert-adv-y="1000" />
    fun addTilde(bmp: Bitmap) {
        val glyph = edgeDetector.makeGlyphString(
            bmp,
            "uni7e",
            464,
            "&#x7e;"
        )
        fontGlyphs.add(glyph)
    }
}