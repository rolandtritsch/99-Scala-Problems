package org.p99.scala

import org.scalatest._

class P23Spec extends FlatSpec {
  import P23._

  "randomSelect(n, l)" should "return n randomly selected elements from l" in {
    assert(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).size === 3)
  }

  it should "return the empty list, if asked to remove no elements" in {
    assert(randomSelect(0, "This is a test".toList) === List())
  }

  it should "return the elements from the given list, if asked to remove all elements" in {
    val l = "This is a test".toList
    assert(randomSelect(l.size, l).toSet === l.toSet)
  }

  it should "throw an exception, if asked to remove more elements than there are in the list" in {
    val l = "This is a test".toList
    assertThrows[java.lang.IllegalArgumentException] {
      randomSelect(l.size + 1, l)
    }
  }
}

