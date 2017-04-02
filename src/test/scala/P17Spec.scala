package org.p99.scala

import org.scalatest._

class P17Spec extends FlatSpec {
  import P17._

  "split(n, List(...))" should "return two lists that are split at position n" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val result = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(split(3, l) === result)
  }

  it should "return two empty list, if you split an empty list at position 0" in {
    assert(split(0, List()) === (List(), List()))
  }

  it should "throw an exception, when n is not in range" in {
    assertThrows[java.lang.IllegalArgumentException] {
      split(1, List()) === (List(), List())
    }
    assertThrows[java.lang.IllegalArgumentException] {
      split(-1, List()) === (List(), List())
    }
  }

  it should "return the original list as the second argument, when you split it at position 0" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(split(0, l) === (List(), l))
  }

  it should "return the original list as the first argument, when you split it at position List.size" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(split(l.size, l) === (l, List()))
  }
}

