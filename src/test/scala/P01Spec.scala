package org.p99.scala

import org.scalatest._

class P01Spec extends FlatSpec {
  import P01._

  "last(List(...)" should "return the last element of the list" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  it should "throw an exception when invoked with an empty list" in {
    assertThrows[java.lang.IllegalArgumentException] {
      last(List())
    }
  }
}