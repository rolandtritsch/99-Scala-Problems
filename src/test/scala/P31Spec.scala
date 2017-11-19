package org.p99.scala

import org.scalatest._

class P31Spec extends FlatSpec {
  import P31._

  "isPrime(...)" should "throw an exception, if p is <= 0" in {
    assertThrows[IllegalArgumentException] {
      isPrime(0)
    }
  }

  it should "return true, for all prime numbers" in {
    val ps = List(1, 2, 3, 5, 7, 11, 13, 17, 19, 997)
    assert(ps.forall(isPrime(_)))
  }
}

