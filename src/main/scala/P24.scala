package org.p99.scala

object P24 {
  /** Lotto: Draw N different random numbers from the set 1..M.
    *
    * @note Again: Use P22 and P23 to solve the problem
    *
    * @param n number of numbers to draw
    * @param outOf range of numbers to draw from [1 .. outOf]
    * @return the n random numbers out of the range
    */
  def lotto(n: Int, outOf: Int): List[Int] = {
    require(n >= 0 && n <= outOf)
    require(outOf >= 1)

    P23.randomSelect(n, P22.range(1, outOf)).sorted
  }
}
