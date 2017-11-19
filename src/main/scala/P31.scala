package org.p99.scala

object P31 {

  /** Determine whether a given integer number is prime.
    *
    * https://en.wikipedia.org/wiki/Primality_test
    *
    * @param p - The number to check
    * @return If p is prime or not
    */
  def isPrime(p: Int): Boolean = {
    require(p > 0, s"p is ${p}; needs to be > 0")
    p match {
      case p if(p <= 3) => true
      case p if(p % 2 == 0) => false
      case p if(p % 3 == 0) => false
      case p => {
        var i = 5
        var done = false
        while(p >= i * i && !done) {
          if(p % i == 0 || p % (i + 2) == 0) done = true
          else i = i + 6
        }
        if(done) false else true
      }
    }
  }
}
