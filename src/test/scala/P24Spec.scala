package org.p99.scala

import org.scalatest._

class P24Spec extends FlatSpec {
  import P24._

  "lotto(n, outOf)" should "return n random numbers out of the given range" in {
    assert(lotto(6, 49).size === 6)
  }

  it should "return an empty list, if the number of numbers to draw is 0" in {
    assert(lotto(0, 100) === List())
  }

  it should "return the given list, if n is equal to the size of the list" in {
    assert(lotto(49, 49) === (1 to 49).toList)
  }

  it should "throw an exception, if n is bigger than the range (because the resulting list needs to be distinct (no duplicates))" in {
    assertThrows[java.lang.IllegalArgumentException] {
      lotto(50, 49)
    }
  }
}

