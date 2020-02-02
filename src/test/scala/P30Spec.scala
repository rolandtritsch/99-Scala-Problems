package org.p99.scala

import org.scalatest._

class P30Spec extends FlatSpec {
  import P30._

  "lsortFreq(..)" should "return an empty list, when given an empty list" in {
    assert(lsortFreq(List()) === List())
  }

  "lsortFreq(..)" should "return the list, when given a list of one list" in {
    val l = List(List('a, 'b, 'c))
    assert(lsortFreq(l) === l)
  }

  "lsortFreq(..)" should "return the sorted list, for a given list of lists" in {
    val l = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    val result = List(List('o), List('i, 'j, 'k, 'l), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
    assert(lsortFreq(l) === result)
  }
}
