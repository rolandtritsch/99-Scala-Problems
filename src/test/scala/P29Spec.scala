package org.p99.scala

import org.scalatest._

class P29Spec extends FlatSpec {
  import P29._

  "lsort(..)" should "return an empty list, when given an empty list" in {
    assert(lsort(List()) === List())
  }

  "lsort(..)" should "return the list, when given a list of one list" in {
    val l = List(List('a, 'b, 'c))
    assert(lsort(l) === l)
  }

  "lsort(..)" should "return the list on the right order, when given a list of two equally long lists" in {
    val l = List(List('x, 'y, 'z), List('a, 'b, 'c))
    assert(lsort(l) === l)
  }

  "lsort(...)" should "return the sorted list of lists (by length; shortest first)" in {
    val l = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    val result = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
    assert(lsort(l) === result)
  }
}

