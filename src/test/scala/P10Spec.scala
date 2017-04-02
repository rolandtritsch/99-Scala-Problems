package org.p99.scala

import org.scalatest._

class P10Spec extends FlatSpec {
  import P10._

  "encode(List(...))" should "return the encoded list" in {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    assert(encode(l) === result)
  }

  it should "throw an exception, if given an empty list" in {
    assertThrows[java.lang.IllegalArgumentException] {
      encode(List()) === List()
    }
  }

  it should "return an encoded list of the same size, if given a list with no duplicates" in {
    val l = List(3, 2, 1)
    assert(encode(l).size === l.size)
    assert(encode(l) === l.map((1, _)))
  }
}

