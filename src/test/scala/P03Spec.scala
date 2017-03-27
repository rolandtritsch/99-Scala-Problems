package org.p99.scala

import org.scalatest._

class P03Spec extends FlatSpec {
  import P03._

  "nth(n, List(...))" should "return the n-th element" in {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }

  it should "throw an exception when invoked with an empty list" in {
    assertThrows[java.lang.IllegalArgumentException] {
      nth(0, List())
    }
  }

  it should "throw an exception when invoked n being out of bounds (low)" in {
    assertThrows[java.lang.IllegalArgumentException] {
      nth(-1, List(0))
    }
  }

  it should "throw an exception when invoked n being out of bounds (high)" in {
    assertThrows[java.lang.IllegalArgumentException] {
      nth(1, List(0))
    }
  }
}

