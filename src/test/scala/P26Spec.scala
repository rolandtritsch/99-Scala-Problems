package org.p99.scala

import org.scalatest._

class P26Spec extends FlatSpec {
  import P26._

  "combinations(k, List(...))" should "return all combinations of k elements" in {
    assert(combinations(3, (0 to 11).toList).size === 220)
    assert(combinations(2, (0 to 1).toList) === List(List(0, 1)))
    assert(combinations(3, (0 to 11).toList) === combinations2(3, (0 to 11).toList))
  }

  it should "return the empty list, if given an empty list" in {
    assert(combinations(0, List()) === List())
  }

  it should "return a/the list of the list of elements, if k == 1" in {
    val l = (0 to 9).toList
    assert(combinations(1, l) === l.map(List(_)))
    assert(combinations(1, l).size === l.size)
  }

  it should "return a list with one element (a list with all elements), if k == l.size)" in {
    val l = (0 to 6).toList
    assert(combinations(l.size, l) === List(l))
    assert(combinations(l.size, l).size === 1)
  }
}