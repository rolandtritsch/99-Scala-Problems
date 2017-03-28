package org.p99.scala

import org.scalatest._

class P05Spec extends FlatSpec {
  import P05._

  "reverse(List(...)" should "return the list in reversed order" in {
    val l = List(1, 1, 2, 3, 5, 8)
    assert(reverse(l) === l.reverse)
  }

  it should "return the empty list for the empty list" in {
    assert(reverse(List()) === List())
  }

  it should "return the list, if you reverse it twice" in {
    val l = List(1, 1, 2, 3, 5, 8)
    assert(reverse(reverse(l)) === l)
  }
}

