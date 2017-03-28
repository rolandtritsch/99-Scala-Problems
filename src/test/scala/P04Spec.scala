package org.p99.scala

import org.scalatest._

class P04Spec extends FlatSpec {
  import P04._

  "length(List(...)" should "return the size of the list" in {
    assert(length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  it should "return 0 for empty Lists" in {
    assert(length(List()) === 0)
  }
}