package org.p99.scala

import org.scalatest._

class P20Spec extends FlatSpec {
  import P20._

  "removeAt(k, List(...))" should "return a/the tuple of (List(<remaining elements>, <removed element>)" in {
    val l = List('a, 'b, 'c, 'd)
    val result = (List('a, 'c, 'd),'b)
    assert(removeAt(1, l) === result)
  }

  it should "throw an exception, if k is out of range" in {
    assertThrows[java.lang.IllegalArgumentException] {
      removeAt(-1, List()) === List()
    }
    assertThrows[java.lang.IllegalArgumentException] {
      removeAt(1, List()) === List()
    }
  }

  it should "throw an exception, if the given list is empty" in {
    assertThrows[java.lang.IllegalArgumentException] {
      removeAt(0, List())
    }
  }

  it should "return the empty list, if the given list has one element" in {
    assert(removeAt(0, List(1)) === (List(), 1))
  }
}

