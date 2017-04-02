package org.p99.scala

import org.scalatest._

class P21Spec extends FlatSpec {
  import P21._

  "insertAt(e, n, List(...))" should "return a/the list with element e inserted at position k" in {
    val l = List('a, 'b, 'c, 'd)
    val result = List('a, 'new, 'b, 'c, 'd)
    assert(insertAt('new, 1, l) === result)
  }

  it should "return a/the list with the element, if the element is inserted into an empty list" in {
    assert(insertAt(0, 0, List()) === List(0))
  }

  it should "return a/the list with the element prepended, if inserted at position 0" in {
    val l = List('a, 'b, 'c, 'd)
    assert(insertAt('new, 0, l) === 'new :: l)
  }

  it should "return a/the list with the element appended, if inserted at position 0" in {
    val l = List('a, 'b, 'c, 'd)
    assert(insertAt('new, l.size, l) === l ::: List('new))
  }
}

