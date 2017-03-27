package org.p99.scala

import org.scalatest._

class P02Spec extends FlatSpec {
  import P02._

  "penultimate(List(...)" should "return the last but one element from the list" in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  it should "throw an exception when invoked with an empty list" in {
    assertThrows[java.lang.IllegalArgumentException] {
      penultimate(List())
    }
  }
}

