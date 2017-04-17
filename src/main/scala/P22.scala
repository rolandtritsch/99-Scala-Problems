package org.p99.scala

object P22 {
  /** Create a list containing all integers within a given range.
    *
    * @param start start number
    * @param end end number
    * @return a/the list from start (inclusive) to end (inclusive)
    */
  def range(start: Int, end: Int): List[Int] = {
    (start to end).toList
  }
}
