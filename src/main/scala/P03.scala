package org.p99.scala

object P03 {
  /** Find the Kth element of a list.
    *
    * @param n the index of the element to return
    * @param l the list
    * @return the element at index n
    */
  def nth(n: Int, l: List[Int]): Int = {
    require(n >= 0 && n <= l.size - 1)
    l(n)
  } ensuring(_ == l(n))
}
