package org.p99.scala

import org.scalatest._

class P12Spec extends FlatSpec {
  import P10._
  import P12._

  "decode(List(...)" should "return the decoded list" in {
    val l = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val result = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(decode(l) === result)
  }

  it should "throw an exception, if given an empty list" in {
    assertThrows[java.lang.IllegalArgumentException] {
      decode(List()) === List()
    }
  }

  it should "return the same list again, if the list is encoded/decoded" in {
    val l = "aaaabccccdeeeeee".toList
    assert(decode(encode(l)) === l)
  }
}

