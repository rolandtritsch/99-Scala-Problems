package org.p99.scala

object P04 {
  /** Find the number of elements of a list.
    *
    * @param l the list
    * @return the number of elements in the list
    */
  def length(l: List[_]): Int = {
    l.size
  } ensuring(_ == l.size)
}
