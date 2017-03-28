package org.p99.scala

import org.scalatest._

class P07Spec extends FlatSpec {
  import P07._

  "flatten(List(...))" should "return the flatten list" in {
    val l = List(List(1, 1), 2, List(3, List(5, 8)))
    val result = List(1, 1, 2, 3, 5, 8)
    assert(flatten(l) === result)
  }

  it should "return the empty list for an empty list" in {
    assert(flatten(List()) === List())
  }
}
