package org.p99.scala

import org.scalatest._

class P16Spec extends FlatSpec {
  import P16._

  "drop(List(...))" should "return the list with every n-th element dropped" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val result = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    assert(drop(3, l) === result)
  }

  it should "return the empty list, if given an empty list" in {
    assert(drop(9999, List()) === List())
  }

  it should "throw an exception, n is not >= 0" in {
    assertThrows[java.lang.IllegalArgumentException] {
      drop(-1, List()) == List()
    }
  }

  it should "return the empty list, if n is 1 (for any list)" in {
    assert(drop(1, "ccccccfngencebfkbrcvfbbcfnejlrtcjucchidijkhr".toList) === List())
    assert(drop(1, "rrrrroooolllllllaaaaaannnndddd".toList) === List())
  }

  it should "return the original list for n == 0" in {
    val l = "ccccccfngencljcufbnlricfhevjeckjvcvnduviindl".toList
    assert(drop(0, l) === l)
  }

  it should "return the original list, if n > t.size" in {
    val l = "ccccccfngencljcufbnlricfhevjeckjvcvnduviindl".toList
    assert(drop(l.size + 1, l) === l)
  }
}

