package org.p99.scala

object P32 {

  /** Determine the greatest common divisor of two positive integer numbers.
    *
    * Use Euclid's algorithm.
    *
    * https://en.wikipedia.org/wiki/Euclidean_algorithm
    *
    * @param a - First number
    * @param b - Second number
    * @return The greatest common divisor for the two numbers
    */
  def gcd(a: Int, b: Int): Int = {
    require(a >= 0, s"a is ${a}; needs to be >= 0")
    require(b >= 0, s"b is ${b}; needs to be >= 0")

    if(a == b) a
    else if(a > b) gcd(a - b, b)
    else if(a < b) gcd(a, b - a)
    else {assert(false); 0}
  }

}
