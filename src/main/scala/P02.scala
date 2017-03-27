package org.p99.scala

object P02 {
  /** Find the last but one element of a list.
    *
    * @param l the list
    * @return the last but one element of the list
    */
  def penultimate(l: List[Int]): Int = {
    require(l.size >= 2)
    l(l.size - 2)
  } ensuring(_ == l(l.size - 2))
}
