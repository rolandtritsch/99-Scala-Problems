package org.p99.scala

object P16 {
  /** Drop every Nth element from a list.
    *
    * @param n drop every n-th element.
    * @param l the list to drop elements from
    * @return the smaller list
    */
  def drop(n: Int, l: List[_]): List[_] = {
    require(n >= 0)

    def dropN(n: Int, i: Int, l: List[_]): List[_] = {
      if(l.isEmpty) List()
      else if (i == 0) dropN(n, n - 1, l.drop(1))
      else l.head +: dropN(n, i - 1, l.drop(1))
    }
    dropN(n, n - 1, l)
  } ensuring(_.size <= l.size)
}
