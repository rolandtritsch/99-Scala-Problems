package org.p99.scala

import org.scalatest._

class P11Spec extends FlatSpec {
  import P11._

  "encodedModified(List(...)" should "return the encoded list" in {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
    assert(encodedModified(l) === result)
  }

  it should "should throw an exception, if given an empty list" in {
    assertThrows[java.lang.IllegalArgumentException] {
      encodedModified(List()) === List()
    }
  }

  it should "return the list, if the list has no duplicates" in {
    val l = "abczyx".toList
    assert(encodedModified(l) === l)
  }
}

