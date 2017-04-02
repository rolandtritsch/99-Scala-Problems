package org.p99.scala

import org.scalatest._

class P08Spec extends FlatSpec {
  import P08._

  "compress(List(...)" should "return the list without successive duplicates" in {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List('a, 'b, 'c, 'a, 'd, 'e)
    assert(compress(l) === result)
  }

  it should "return the empty list for the empty list" in {
    assert(compress(List()) === List())
  }

  it should "return the list, if it has only one element" in {
    assert(compress(List('a')) === List('a'))
  }

  it should "return the list, if the list cannot be compressed" in {
    val l = List(1, 2, 3)
    assert(compress(l) === l)
  }
}

