package org.p99.scala

import org.scalatest._

class P06Spec extends FlatSpec {
  import P06._

  "palindrome(List(...)" should "return true for a palindrome" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  it should "return true for a palindrome (string)" in {
    assert(isPalindrome("racecar".toList))
  }

  it should "return false if the list is not a palindrome" in {
    assert(!isPalindrome(List(9999, 1, 2, 3, 2, 1)))
  }

  it should "return true for an empty list" in {
    assert(isPalindrome(List()))
  }
}

