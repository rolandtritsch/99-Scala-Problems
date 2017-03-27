package org.p99.scala

object P01 {
  /** Find the last element of a list.
    *
    * @param l the list
    * @return the last element
    */
  def last(l: List[Int]): Int = {
    require(!l.isEmpty)
    l(l.size - 1)
  } ensuring(_ == l(l.size - 1))

  def run(): Unit = {
    assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
  }
}
