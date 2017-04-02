package org.p99.scala

object P15 {
  /** Duplicate the elements of a list a given number of times.
    *
    * @param n number of times to duplicate a given element
    * @param l the list
    * @tparam T the type of the elements in the list
    * @return the leist with every element duplicated N times.
    */
  def duplicateN[T](n: Int, l: List[T]): List[T] = {
    l.map(e => for (i <- 0 to n - 1) yield e).flatten
  }
}