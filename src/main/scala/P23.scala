package org.p99.scala

object P23 {
  /** Extract a given number of randomly selected elements from a list.
    *
    * @note Use the solution to problem P20
    * @note Implemented it as a recursion (just for the fun of it)
    *
    * @param n the number of elements to collect (by removing them from the given list)
    * @param l the list to take elements from
    * @return the list of randomly selected elements
    */
  def randomSelect[T](n: Int, l: List[T]): List[T] = {
    require(n >= 0 && n <= l.size)

    import scala.util.Random

    if (n == 0) List()
    else if (n > 0) {
      val (rest, removed) = P20.removeAt(Random.nextInt(l.size), l)
      List(removed) ::: randomSelect(n - 1, rest)
    } else {
      assert(false, "Upps ... this cannot happen")
      List()
    }
   }
}
