package org.p99.scala

import org.scalatest._

class P09Spec extends FlatSpec {
  import P09._

  "pack(List(...))" should "return a list with sublists for all duplicates" in {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    assert(pack(l) === result)
  }

  it should "return the empty list, if the given list is the empty list" in {
    assert(pack(List()) === List(List()))
  }

  it should "return the list, if the list has no duplicates" in {
    val l = List(3, 2, 1)
    assert(pack(l) === l.map(List(_)))
  }
}

