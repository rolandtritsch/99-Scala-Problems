package org.p99.scala

import org.scalatest._

class P18Spec extends FlatSpec {
  import P18._

  "slice(i, k, List(...))" should "return the sub-list of the given list in the range [i, k)" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val result = List('d, 'e, 'f, 'g)
    assert(slice(3, 7, l) === result)
  }

  it should "return the empty list, if i == k" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(slice(0, 0, l) === List())
    assert(slice(1, 1, l) === List())
    assert(slice(2, 2, l) === List())
    assert(slice(3, 3, l) === List())
  }

  it should "return the i-th element, if k = i + 1" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(slice(0, 1, l) === List(l.head))
    assert(slice(l.size - 1, l.size, l) === List(l.last))
  }

  it should "return the entire, given list, if the slice goes from 0 to l.size" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(slice(0, l.size, l) === l)
  }

  it should "throw an exception, if i > k" in {
    assertThrows[java.lang.IllegalArgumentException] {
      slice(1, 0, List()) === List()
    }
  }

  it should "throw an exception, if [i, k) is out of range" in {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assertThrows[java.lang.IllegalArgumentException] {
      slice(0 - 1, l.size, l) === List()
    }
    assertThrows[java.lang.IllegalArgumentException] {
      slice(0, l.size + 1, l) === List()
    }
  }
}

