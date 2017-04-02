package org.p99.scala

import org.scalatest._

class P14Spec extends FlatSpec {
  import P14._

  "duplicate(List(...))" should "return the list with every element duplicated" in {
    val l = List('a, 'b, 'c, 'c, 'd)
    val result = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    assert(duplicate(l) === l.map(e => List(e, e)).flatten)
  }

  it should "return the list with every element duplicated (again)" in {
    val l = "8888266644".toList
    assert(duplicate(l) === l.map(e => List(e, e)).flatten)
  }

  it should "return an empty list, if given an empty list" in {
    assert(duplicate(List()) === List())
  }
}

