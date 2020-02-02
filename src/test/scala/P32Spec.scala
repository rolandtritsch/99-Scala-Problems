package org.p99.scala

import org.scalatest._

class P32Spec extends FlatSpec {
  import P32._

  "gcd(...)" should "throw an exception, if a or b is < 0" in {
    assertThrows[IllegalArgumentException] {
      gcd(0, -1)
    }
    assertThrows[IllegalArgumentException] {
      gcd(-1, 0)
    }
  }

  it should "return the correct result for the testcase(s)" in {
    assert(gcd(36, 63) == 9)
  }
}
