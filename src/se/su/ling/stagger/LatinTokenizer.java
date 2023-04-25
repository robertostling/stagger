/* The following code was generated by JFlex 1.4.3 on 11/24/13 1:26 AM */

package se.su.ling.stagger;
import java.util.*;
import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/24/13 1:26 AM from the specification file
 * <tt>LatinTokenizer.flex</tt>
 */
public class LatinTokenizer extends Tokenizer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\13\2\0\1\12\22\0\1\11\1\50\1\53\1\26"+
    "\1\35\1\27\1\26\1\34\1\44\1\40\1\53\1\27\1\47\1\25"+
    "\1\24\1\22\3\16\1\43\6\16\1\6\1\32\1\42\1\37\1\46"+
    "\1\51\1\30\2\31\1\73\1\5\1\72\1\21\1\76\1\17\1\4"+
    "\3\31\1\74\1\71\1\36\1\20\1\31\1\75\1\2\1\3\2\31"+
    "\1\23\1\31\1\45\1\31\1\1\1\26\1\10\1\41\1\7\1\53"+
    "\2\31\1\73\1\5\1\72\1\21\1\76\1\17\1\4\3\31\1\74"+
    "\1\71\1\36\1\20\1\31\1\75\1\2\1\3\2\31\1\23\1\33"+
    "\1\45\1\31\3\53\1\26\6\0\1\14\32\0\1\11\37\53\27\56"+
    "\1\53\37\56\1\53\210\56\u01f0\0\220\57\u0200\0\140\60\12\61\206\60"+
    "\12\61\6\60\120\0\60\60\u0180\0\146\62\12\63\20\62\146\0\12\15"+
    "\166\0\12\15\166\0\12\15\166\0\12\15\167\0\11\15\166\0\12\15"+
    "\166\0\12\15\166\0\12\15\340\0\12\15\166\0\12\15\106\0\12\15"+
    "\u0116\0\12\15\266\0\u0100\65\u0169\0\11\15\u046e\0\12\15\46\0\12\15"+
    "\u012c\0\12\15\u0380\0\60\62\u0200\0\u0100\57\16\11\2\0\6\52\22\53"+
    "\2\55\33\53\u0fbb\0\1\54\37\53\40\0\300\64\60\0\140\65\u0270\0"+
    "\u19c0\66\100\0\u5200\66\u08e0\0\40\62\140\0\40\65\u2e30\0\120\65\100\70"+
    "\60\67\u0790\70\u1b50\0\u02b0\60\160\0\220\60\20\0\12\15\113\0\73\64"+
    "\140\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\3\3\3\2\1\4\1\1\1\5"+
    "\2\6\2\3\1\2\1\3\1\7\1\10\1\3\1\2"+
    "\1\3\6\2\1\7\1\10\2\2\1\3\1\11\2\12"+
    "\2\13\1\14\1\15\1\16\1\1\1\0\1\17\6\0"+
    "\1\17\2\0\1\20\2\0\1\21\2\3\1\0\1\2"+
    "\1\17\3\0\1\17\1\0\1\17\1\2\1\0\1\17"+
    "\6\0\2\3\3\17\5\0\1\3\3\0\1\22\2\0"+
    "\1\22\1\0\1\23\2\0\1\22\1\0\1\23\2\22"+
    "\1\24\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[107];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\77\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u02f4\0\u0333\0\u0372"+
    "\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b\0\u056a"+
    "\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\77\0\u01f8"+
    "\0\u0276\0\u0723\0\u0762\0\u07a1\0\u07e0\0\u081f\0\u085e\0\77"+
    "\0\77\0\77\0\u089d\0\u08dc\0\77\0\u01b9\0\u091b\0\u095a"+
    "\0\u0999\0\u04ec\0\u05a9\0\u09d8\0\u09d8\0\u0a17\0\u01f8\0\u0237"+
    "\0\u0a56\0\u0a95\0\u0ad4\0\u0b13\0\u046e\0\u0b52\0\u0b91\0\u0bd0"+
    "\0\u0c0f\0\u0c4e\0\u056a\0\u0c8d\0\u05e8\0\u0ccc\0\u0d0b\0\u0d4a"+
    "\0\u0d89\0\u0dc8\0\u0e07\0\u0e46\0\u0e85\0\u0ec4\0\u0f03\0\u0f42"+
    "\0\u0bd0\0\u01b9\0\u0f81\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\u10bc"+
    "\0\u10fb\0\u113a\0\u1179\0\u11b8\0\u01b9\0\u11f7\0\u1236\0\u1275"+
    "\0\u12b4\0\u12f3\0\u1332\0\u1371\0\u13b0\0\u13ef\0\u142e\0\u146d"+
    "\0\u14ac\0\77\0\u0ec4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[107];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\2\14\1\15\1\16\1\17\1\6\1\20"+
    "\1\21\1\22\1\23\1\24\1\11\1\10\1\11\1\5"+
    "\1\7\1\25\1\11\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\16\1\34\1\5\1\11\1\35\2\36\1\37"+
    "\1\11\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\2\6\5\101\0"+
    "\1\54\76\0\1\4\2\5\1\4\1\55\1\56\6\0"+
    "\1\56\1\5\1\4\1\5\1\0\1\5\1\57\1\60"+
    "\1\0\1\56\1\61\1\5\1\55\1\5\1\0\1\62"+
    "\1\5\1\0\1\62\2\0\1\56\1\62\1\5\10\0"+
    "\1\42\12\0\6\5\2\0\4\5\1\0\1\56\6\0"+
    "\1\56\3\5\1\0\1\5\1\57\1\56\1\0\1\56"+
    "\1\61\1\5\1\0\1\5\2\0\1\5\4\0\1\56"+
    "\1\0\1\5\10\0\1\42\12\0\6\5\2\0\1\4"+
    "\2\5\1\6\1\55\1\56\6\0\1\56\1\5\1\6"+
    "\1\5\1\0\1\5\1\57\1\60\1\0\1\56\1\61"+
    "\1\5\1\55\1\5\1\0\1\62\1\5\1\55\1\63"+
    "\2\0\1\56\1\63\1\5\10\0\1\42\12\0\6\5"+
    "\2\0\1\64\2\0\1\64\12\0\1\64\4\0\1\65"+
    "\6\0\1\66\1\64\1\55\1\0\1\64\3\0\1\64"+
    "\34\0\4\56\1\0\1\56\6\0\4\56\1\0\3\56"+
    "\1\0\1\56\1\61\1\56\1\0\1\56\2\0\1\56"+
    "\4\0\1\56\1\0\1\56\23\0\6\56\11\0\1\67"+
    "\1\70\2\14\37\0\1\67\1\14\34\0\1\14\74\0"+
    "\1\14\1\71\2\72\37\0\1\14\1\72\36\0\2\15"+
    "\24\0\1\15\15\0\1\15\1\0\1\15\15\0\4\56"+
    "\1\0\1\56\5\0\1\15\1\16\3\56\1\0\3\56"+
    "\1\0\1\56\1\61\1\56\1\0\1\56\2\0\1\56"+
    "\4\0\1\16\1\0\1\56\13\0\1\15\1\0\1\15"+
    "\5\0\6\56\2\0\1\5\1\20\2\5\1\0\1\56"+
    "\6\0\1\56\3\5\1\0\1\5\1\57\1\56\1\0"+
    "\1\56\1\61\1\5\1\0\1\5\2\0\1\5\4\0"+
    "\1\56\1\0\1\5\10\0\1\42\12\0\6\5\2\0"+
    "\1\5\1\73\2\5\1\0\1\56\6\0\1\56\3\5"+
    "\1\0\1\5\1\57\1\56\1\0\1\56\1\61\1\5"+
    "\1\0\1\5\2\0\1\5\4\0\1\56\1\0\1\5"+
    "\10\0\1\42\12\0\6\5\22\0\1\21\56\0\4\5"+
    "\1\0\1\56\6\0\1\56\3\5\1\0\1\74\1\57"+
    "\1\56\1\0\1\56\1\61\1\5\1\0\1\5\2\0"+
    "\1\5\4\0\1\56\1\0\1\5\10\0\1\42\12\0"+
    "\6\5\2\0\4\56\1\0\1\56\6\0\4\56\1\0"+
    "\1\56\1\23\1\56\1\0\1\56\1\61\1\56\1\0"+
    "\1\56\2\0\1\56\4\0\1\56\1\0\1\56\2\0"+
    "\2\36\17\0\6\56\2\0\4\56\1\0\1\56\6\0"+
    "\4\56\1\0\2\56\1\75\1\0\1\56\1\61\1\56"+
    "\1\0\1\56\2\0\1\56\4\0\1\56\1\0\1\56"+
    "\1\76\22\0\6\56\2\0\1\77\2\5\1\77\1\0"+
    "\1\56\6\0\1\56\1\5\1\77\1\5\1\0\1\5"+
    "\1\57\1\100\1\0\1\56\1\61\1\5\1\0\1\5"+
    "\1\66\1\64\1\5\1\0\1\64\2\0\1\56\1\64"+
    "\1\5\10\0\1\42\12\0\6\5\2\0\1\62\2\0"+
    "\1\62\1\55\11\0\1\62\4\0\1\101\4\0\1\55"+
    "\2\0\1\62\2\0\1\62\3\0\1\62\34\0\4\5"+
    "\1\0\1\102\6\0\1\56\3\5\1\0\1\5\1\57"+
    "\1\56\1\0\1\56\1\61\1\5\1\0\1\5\2\0"+
    "\1\5\4\0\1\56\1\0\1\5\10\0\1\42\12\0"+
    "\6\5\5\0\1\103\12\0\1\103\17\0\1\103\3\0"+
    "\1\103\34\0\1\62\2\0\1\63\1\55\11\0\1\63"+
    "\4\0\1\101\4\0\1\55\2\0\1\62\1\0\1\55"+
    "\1\63\3\0\1\63\41\0\1\104\31\0\1\105\62\0"+
    "\1\106\14\0\1\107\1\110\35\0\1\62\2\0\1\63"+
    "\1\55\11\0\1\63\4\0\1\101\4\0\1\55\2\0"+
    "\1\62\1\0\1\55\1\63\3\0\1\63\1\111\100\0"+
    "\1\35\77\0\2\36\27\0\4\42\11\0\3\42\1\0"+
    "\1\42\5\0\1\42\1\0\1\42\2\0\1\42\6\0"+
    "\1\42\10\0\1\42\12\0\6\42\57\0\1\43\77\0"+
    "\2\44\32\0\2\15\24\0\1\15\14\0\1\44\1\45"+
    "\1\0\1\15\75\0\2\46\30\0\2\15\24\0\1\15"+
    "\15\0\1\15\1\46\1\47\102\0\2\52\11\0\1\112"+
    "\75\0\4\56\1\0\1\56\6\0\4\56\1\0\3\56"+
    "\1\0\1\56\1\61\1\56\1\0\1\56\2\0\1\113"+
    "\4\0\1\56\1\0\1\56\23\0\1\114\1\56\1\115"+
    "\3\56\2\0\4\56\1\55\1\56\6\0\4\56\1\0"+
    "\3\56\1\0\1\56\1\61\1\56\1\55\1\56\2\0"+
    "\1\56\4\0\1\56\1\0\1\56\23\0\6\56\2\0"+
    "\4\116\10\0\4\116\1\0\3\116\3\0\1\116\1\0"+
    "\1\116\2\0\1\116\4\0\1\116\1\0\1\116\23\0"+
    "\6\116\2\0\1\64\2\0\1\64\12\0\1\64\14\0"+
    "\1\64\2\0\1\64\3\0\1\64\34\0\1\64\2\0"+
    "\1\64\12\0\1\64\4\0\1\65\7\0\1\64\2\0"+
    "\1\64\3\0\1\64\45\0\1\72\74\0\1\72\1\71"+
    "\2\72\37\0\2\72\23\0\4\5\1\0\1\56\6\0"+
    "\1\56\1\5\1\117\1\5\1\0\1\5\1\57\1\56"+
    "\1\0\1\56\1\61\1\5\1\0\1\5\2\0\1\5"+
    "\4\0\1\56\1\0\1\5\10\0\1\42\12\0\6\5"+
    "\2\0\4\5\1\0\1\56\6\0\1\56\3\5\1\0"+
    "\1\120\1\57\1\56\1\0\1\56\1\61\1\5\1\0"+
    "\1\5\2\0\1\5\4\0\1\56\1\0\1\5\10\0"+
    "\1\42\12\0\6\5\46\0\1\76\32\0\1\77\2\5"+
    "\1\77\1\0\1\56\6\0\1\56\1\5\1\77\1\5"+
    "\1\0\1\5\1\57\1\56\1\0\1\56\1\61\1\5"+
    "\1\0\1\5\1\0\1\64\1\5\1\0\1\64\2\0"+
    "\1\56\1\64\1\5\10\0\1\42\12\0\6\5\2\0"+
    "\1\121\2\56\1\121\1\0\1\56\6\0\2\56\1\121"+
    "\1\56\1\0\3\56\1\0\1\56\1\61\1\56\1\0"+
    "\1\56\1\0\1\64\1\56\1\0\1\64\2\0\1\56"+
    "\1\64\1\56\23\0\6\56\6\0\1\55\23\0\1\55"+
    "\46\0\4\56\1\0\1\56\6\0\4\56\1\0\3\56"+
    "\1\0\1\56\1\61\1\56\1\0\1\56\2\0\1\122"+
    "\4\0\1\56\1\0\1\56\23\0\6\56\7\0\1\104"+
    "\31\0\1\123\62\0\1\106\76\0\1\106\14\0\1\107"+
    "\77\0\1\110\73\0\1\55\42\0\1\124\74\0\4\56"+
    "\1\0\1\56\6\0\4\56\1\0\3\56\1\0\1\56"+
    "\1\61\1\56\1\0\1\56\2\0\1\56\4\0\1\56"+
    "\1\0\1\56\23\0\4\56\1\125\1\56\2\0\4\56"+
    "\1\0\1\56\6\0\4\56\1\0\3\56\1\0\1\56"+
    "\1\61\1\56\1\0\1\56\2\0\1\56\4\0\1\56"+
    "\1\0\1\56\23\0\1\56\1\126\4\56\2\0\4\56"+
    "\1\0\1\56\6\0\4\56\1\0\3\56\1\0\1\56"+
    "\1\61\1\56\1\0\1\56\2\0\1\127\4\0\1\56"+
    "\1\0\1\56\23\0\6\56\2\0\4\116\10\0\4\116"+
    "\1\0\1\116\1\130\1\116\3\0\1\116\1\0\1\116"+
    "\2\0\1\116\4\0\1\116\1\0\1\116\23\0\6\116"+
    "\2\0\1\131\3\5\1\132\1\56\6\0\1\56\3\5"+
    "\1\0\1\5\1\57\1\56\1\0\1\56\1\61\1\5"+
    "\1\0\1\5\2\0\1\5\4\0\1\56\1\0\1\5"+
    "\10\0\1\42\12\0\6\5\2\0\4\5\1\0\1\56"+
    "\6\0\1\56\3\5\1\0\1\5\1\133\1\56\1\0"+
    "\1\56\1\61\1\5\1\0\1\5\2\0\1\5\4\0"+
    "\1\56\1\0\1\5\10\0\1\42\12\0\6\5\41\0"+
    "\1\123\42\0\1\134\73\0\4\56\1\0\1\56\6\0"+
    "\4\56\1\0\3\56\1\0\1\56\1\61\1\56\1\0"+
    "\1\56\2\0\1\56\4\0\1\56\1\0\1\56\23\0"+
    "\5\56\1\135\2\0\1\56\1\135\2\56\1\0\1\56"+
    "\6\0\4\56\1\0\3\56\1\0\1\56\1\61\1\56"+
    "\1\0\1\56\2\0\1\56\4\0\1\56\1\0\1\56"+
    "\23\0\6\56\2\0\4\56\1\0\1\56\6\0\4\56"+
    "\1\0\3\56\1\0\1\56\1\61\1\56\1\0\1\56"+
    "\2\0\1\56\4\0\1\56\1\0\1\56\23\0\3\56"+
    "\1\135\2\56\2\0\4\136\10\0\1\116\3\136\1\0"+
    "\1\136\1\130\1\116\3\0\1\136\1\0\1\136\2\0"+
    "\1\136\4\0\1\116\1\0\1\136\23\0\6\136\2\0"+
    "\4\5\1\132\1\56\6\0\1\56\3\5\1\0\1\5"+
    "\1\57\1\56\1\0\1\56\1\61\1\5\1\0\1\5"+
    "\2\0\1\5\4\0\1\56\1\0\1\5\10\0\1\42"+
    "\12\0\6\5\22\0\1\137\56\0\4\140\1\0\1\56"+
    "\6\0\4\140\1\0\1\140\1\56\1\140\1\0\1\56"+
    "\1\61\1\140\1\0\1\140\2\0\1\140\4\0\1\140"+
    "\1\0\1\140\23\0\6\140\6\0\1\141\72\0\4\142"+
    "\10\0\1\116\3\142\1\0\1\142\1\130\1\116\3\0"+
    "\1\142\1\0\1\142\2\0\1\142\4\0\1\116\1\0"+
    "\1\142\23\0\6\142\22\0\1\143\56\0\4\140\1\144"+
    "\1\56\6\0\4\140\1\145\1\140\1\133\1\140\1\0"+
    "\1\56\1\61\1\140\1\0\1\140\2\0\1\140\4\0"+
    "\1\140\1\0\1\140\23\0\6\140\2\0\4\146\1\0"+
    "\1\146\6\0\4\146\1\0\1\146\1\0\1\146\3\0"+
    "\1\146\1\0\1\146\2\0\1\146\4\0\1\146\1\0"+
    "\1\146\23\0\6\146\2\0\4\147\10\0\1\116\3\147"+
    "\1\0\1\147\1\130\1\116\3\0\1\147\1\0\1\147"+
    "\2\0\1\147\4\0\1\116\1\0\1\147\23\0\6\147"+
    "\2\0\4\150\10\0\4\150\1\0\1\150\1\0\1\150"+
    "\3\0\1\150\1\0\1\150\2\0\1\150\4\0\1\150"+
    "\1\0\1\150\23\0\6\150\16\0\1\151\24\0\1\151"+
    "\35\0\6\145\6\0\16\145\1\0\4\145\2\0\3\145"+
    "\1\0\1\145\1\0\1\145\17\0\6\145\2\0\4\146"+
    "\1\0\1\146\1\152\5\0\4\146\1\0\1\146\1\0"+
    "\1\146\3\0\1\146\1\0\1\146\2\0\1\146\4\0"+
    "\1\146\1\0\1\146\23\0\6\146\2\0\4\153\10\0"+
    "\1\116\3\153\1\0\1\153\1\130\1\116\3\0\1\153"+
    "\1\0\1\153\2\0\1\153\4\0\1\116\1\0\1\153"+
    "\23\0\6\153\2\0\4\150\1\144\7\0\4\150\1\145"+
    "\1\150\1\143\1\150\3\0\1\150\1\0\1\150\2\0"+
    "\1\150\4\0\1\150\1\0\1\150\23\0\6\150\16\0"+
    "\1\151\3\0\1\145\20\0\1\151\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5355];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\25\1\1\11\10\1\3\11"+
    "\1\1\1\0\1\11\6\0\1\1\2\0\1\1\2\0"+
    "\3\1\1\0\2\1\3\0\1\1\1\0\2\1\1\0"+
    "\1\1\6\0\5\1\5\0\1\1\3\0\1\1\2\0"+
    "\1\1\1\0\1\1\2\0\1\1\1\0\3\1\1\11"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[107];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public ArrayList<Token> readSentence() throws IOException {
    ArrayList<Token> sentence = new ArrayList<Token>();
    Token token, lastNonSpace = null, lastSpace = null;

    while((token = yylex()) != null) {
        if(token.isSpace()) {
            if(token.type == Token.TOK_NEWLINES) {
                if(!sentence.isEmpty()) return sentence;
            }
            lastSpace = token;
        } else {
            if(!sentence.isEmpty()) {
                if(lastSpace != null && lastSpace.type != Token.TOK_SPACE &&
                   token.isCapitalized())
                {
                    yypushback(yylength());
                    return sentence;
                } else if(lastNonSpace != null &&
                        lastNonSpace.value.endsWith(".") &&
                        token.isCapitalized())
                {
                    yypushback(yylength());
                    return sentence;
                } else if(token.type == Token.TOK_SENT_FINAL) {
                    sentence.add(token);
                    return sentence;
                }
            }
            sentence.add(token);
            lastNonSpace = token;
        }
    }
    if(sentence.isEmpty()) return null;
    return sentence;
}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LatinTokenizer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LatinTokenizer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 362) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { return(new Token(Token.TOK_LATIN,yytext(),yychar));
          }
        case 21: break;
        case 10: 
          { return(new Token(Token.TOK_ARABIC,yytext(),yychar));
          }
        case 22: break;
        case 7: 
          { return(new Token(Token.TOK_SENT_FINAL,yytext(),yychar));
          }
        case 23: break;
        case 18: 
          { return(new Token(Token.TOK_URL,yytext(),yychar));
          }
        case 24: break;
        case 1: 
          { return(new Token(Token.TOK_UNKNOWN,yytext(),yychar));
          }
        case 25: break;
        case 6: 
          { return(new Token(Token.TOK_NUMBER,yytext(),yychar));
          }
        case 26: break;
        case 16: 
          { return(new Token(Token.TOK_SPACES,yytext(),yychar));
          }
        case 27: break;
        case 14: 
          { return(new Token(Token.TOK_HANZI,yytext(),yychar));
          }
        case 28: break;
        case 12: 
          { return(new Token(Token.TOK_KANA,yytext(),yychar));
          }
        case 29: break;
        case 13: 
          { return(new Token(Token.TOK_HANGUL,yytext(),yychar));
          }
        case 30: break;
        case 5: 
          { return(new Token(Token.TOK_NEWLINE,yytext(),yychar));
          }
        case 31: break;
        case 20: 
          { sentID = yytext().substring(6, yylength()-1);
          }
        case 32: break;
        case 8: 
          { return(new Token(Token.TOK_DASH,yytext(),yychar));
          }
        case 33: break;
        case 15: 
          { return(new Token(Token.TOK_SMILEY,yytext(),yychar));
          }
        case 34: break;
        case 19: 
          { return(new Token(Token.TOK_EMAIL,yytext(),yychar));
          }
        case 35: break;
        case 2: 
          { return(new Token(Token.TOK_SYMBOL,yytext(),yychar));
          }
        case 36: break;
        case 17: 
          { return(new Token(Token.TOK_NEWLINES,yytext(),yychar));
          }
        case 37: break;
        case 11: 
          { return(new Token(Token.TOK_NAGARI,yytext(),yychar));
          }
        case 38: break;
        case 9: 
          { return(new Token(Token.TOK_GREEK,yytext(),yychar));
          }
        case 39: break;
        case 4: 
          { return(new Token(Token.TOK_SPACE,yytext(),yychar));
          }
        case 40: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
