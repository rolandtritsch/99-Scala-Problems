package org.p99.scala

import org.scalatest._

class P22Spec extends FlatSpec {
  import P22._

  "range(start, end)" should "return a/the list of numbers from start to end" in {
    assert(range(4, 9) === List(4, 5, 6, 7, 8, 9))
  }

  it should "return the empty list, if start > end" in {
    assert(range(1, 0) === List())
  }

  it should "return a/the list with one element, if start == end (and that element needs to be start)" in {
    assert(range(99, 99) === List(99))
  }
}

