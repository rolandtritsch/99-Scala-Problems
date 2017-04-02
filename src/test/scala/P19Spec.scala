package org.p99.scala

import org.scalatest._

class P19Spec extends FlatSpec {
  import P19._

  "rotate(n, List(...))" should "return a/the rotated list (by n positions)" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val result = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    assert(rotate(3, l) === result)
    assert(rotate(3 + l.size, l) === result)
  }

  it should "return a/the rotated list (to the left) (by n positions), if n < 0" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val result = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    assert(rotate(-2, l) === result)
    assert(rotate(-2 - l.size, l) === result)
  }

  it should "return the same list again, if we rotate by the number of element in the list" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(rotate(l.size, l) === l)
    assert(rotate(l.size * (-1), l) === l)
  }
}

