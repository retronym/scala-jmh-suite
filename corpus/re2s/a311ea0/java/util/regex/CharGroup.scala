// GENERATED BY make_perl_groups.pl DO NOT EDIT.
// make_perl_groups.pl >perl_groups.go
package java.util.regex

import java.util.HashMap

class CharGroup(val sign: Int, val cls: Array[Int])

object CharGroup {

  private[this] val code1: Array[Int] = Array[Int]( /* \d */
                                        0x30,
                                        0x39)

  private[this] val code2: Array[Int] = Array[Int](
      /* \s */
      0x9, 0xa, 0xc, 0xd, 0x20, 0x20)

  private[this] val code3: Array[Int] = Array[Int](
      /* \w */
      0x30, 0x39, 0x41, 0x5a, 0x5f, 0x5f, 0x61, 0x7a)

  val PERL_GROUPS: HashMap[String, CharGroup] =
    new HashMap[String, CharGroup]()

  PERL_GROUPS.put("\\d", new CharGroup(+1, code1))
  PERL_GROUPS.put("\\D", new CharGroup(-1, code1))
  PERL_GROUPS.put("\\s", new CharGroup(+1, code2))
  PERL_GROUPS.put("\\S", new CharGroup(-1, code2))
  PERL_GROUPS.put("\\w", new CharGroup(+1, code3))
  PERL_GROUPS.put("\\W", new CharGroup(-1, code3))

  private[this] val code4: Array[Int] = Array[Int](
      /* [:alnum:] */
      0x30, 0x39, 0x41, 0x5a, 0x61, 0x7a)

  private[this] val code5: Array[Int] = Array[Int]( /* [:alpha:] */
                                        0x41,
                                        0x5a,
                                        0x61,
                                        0x7a)

  private[this] val code6: Array[Int] = Array[Int]( /* [:ascii:] */
                                        0x0,
                                        0x7f)

  private[this] val code7: Array[Int] = Array[Int]( /* [:blank:] */
                                        0x9,
                                        0x9,
                                        0x20,
                                        0x20)

  private[this] val code8: Array[Int] = Array[Int]( /* [:cntrl:] */
                                        0x0,
                                        0x1f,
                                        0x7f,
                                        0x7f)

  private[this] val code9: Array[Int] = Array[Int]( /* [:digit:] */
                                        0x30,
                                        0x39)

  private[this] val code10: Array[Int] = Array[Int]( /* [:graph:] */
                                         0x21,
                                         0x7e)

  private[this] val code11: Array[Int] = Array[Int]( /* [:lower:] */
                                         0x61,
                                         0x7a)

  private[this] val code12: Array[Int] = Array[Int]( /* [:print:] */
                                         0x20,
                                         0x7e)

  private[this] val code13: Array[Int] = Array[Int](
      /* [:punct:] */
      0x21, 0x2f, 0x3a, 0x40, 0x5b, 0x60, 0x7b, 0x7e)

  private[this] val code14: Array[Int] = Array[Int]( /* [:space:] */
                                         0x9,
                                         0xd,
                                         0x20,
                                         0x20)

  private[this] val code15: Array[Int] = Array[Int]( /* [:upper:] */
                                         0x41,
                                         0x5a)

  private[this] val code16: Array[Int] = Array[Int](
      /* [:word:] */
      0x30, 0x39, 0x41, 0x5a, 0x5f, 0x5f, 0x61, 0x7a)

  private[this] val code17: Array[Int] = Array[Int](
      /* [:xdigit:] */
      0x30, 0x39, 0x41, 0x46, 0x61, 0x66)

  val POSIX_GROUPS: HashMap[String, CharGroup] =
    new HashMap[String, CharGroup]()

  POSIX_GROUPS.put("[:alnum:]", new CharGroup(+1, code4))
  POSIX_GROUPS.put("[:^alnum:]", new CharGroup(-1, code4))
  POSIX_GROUPS.put("[:alpha:]", new CharGroup(+1, code5))
  POSIX_GROUPS.put("[:^alpha:]", new CharGroup(-1, code5))
  POSIX_GROUPS.put("[:ascii:]", new CharGroup(+1, code6))
  POSIX_GROUPS.put("[:^ascii:]", new CharGroup(-1, code6))
  POSIX_GROUPS.put("[:blank:]", new CharGroup(+1, code7))
  POSIX_GROUPS.put("[:^blank:]", new CharGroup(-1, code7))
  POSIX_GROUPS.put("[:cntrl:]", new CharGroup(+1, code8))
  POSIX_GROUPS.put("[:^cntrl:]", new CharGroup(-1, code8))
  POSIX_GROUPS.put("[:digit:]", new CharGroup(+1, code9))
  POSIX_GROUPS.put("[:^digit:]", new CharGroup(-1, code9))
  POSIX_GROUPS.put("[:graph:]", new CharGroup(+1, code10))
  POSIX_GROUPS.put("[:^graph:]", new CharGroup(-1, code10))
  POSIX_GROUPS.put("[:lower:]", new CharGroup(+1, code11))
  POSIX_GROUPS.put("[:^lower:]", new CharGroup(-1, code11))
  POSIX_GROUPS.put("[:print:]", new CharGroup(+1, code12))
  POSIX_GROUPS.put("[:^print:]", new CharGroup(-1, code12))
  POSIX_GROUPS.put("[:punct:]", new CharGroup(+1, code13))
  POSIX_GROUPS.put("[:^punct:]", new CharGroup(-1, code13))
  POSIX_GROUPS.put("[:space:]", new CharGroup(+1, code14))
  POSIX_GROUPS.put("[:^space:]", new CharGroup(-1, code14))
  POSIX_GROUPS.put("[:upper:]", new CharGroup(+1, code15))
  POSIX_GROUPS.put("[:^upper:]", new CharGroup(-1, code15))
  POSIX_GROUPS.put("[:word:]", new CharGroup(+1, code16))
  POSIX_GROUPS.put("[:^word:]", new CharGroup(-1, code16))
  POSIX_GROUPS.put("[:xdigit:]", new CharGroup(+1, code17))
  POSIX_GROUPS.put("[:^xdigit:]", new CharGroup(-1, code17))
}