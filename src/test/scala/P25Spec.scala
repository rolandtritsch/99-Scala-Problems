package org.p99.scala

import org.scalatest._

class P25Spec extends FlatSpec {
  import P25._

  "randomPermute(List(...))" should "return the list in permutated order" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f)
    assert(randomPermute(l).size === l.size)
    assert(randomPermute(l).toSet === l.toSet)
    assert(randomPermute(l) !== l)
  }

  it should "return an empty list, if given an empty list" in {
    assert(randomPermute(List()) === List())
  }
}

