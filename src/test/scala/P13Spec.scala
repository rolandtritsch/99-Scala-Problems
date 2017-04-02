package org.p99.scala

import org.scalatest._

class P13Spec extends FlatSpec {
  import P12._
  import P13._

  "encodeDirect(List(...))" should "return the encoded list" in {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    assert(encodeDirect(l) === result)
  }

  it should "return an empty list, if given an empty list" in {
    assert(encodeDirect(List()) === List())
  }

  it should "return an encoded list of the same size, if given a list with no duplicates" in {
    val l = List(3, 2, 1)
    assert(encodeDirect(l).size === l.size)
    assert(encodeDirect(l) === l.map((1, _)))
  }

  it should "return the list again, after encoding/decoding" in {
    val l = "33312266666644441".toList
    assert(decode(encodeDirect(l)) === l)
  }
}

