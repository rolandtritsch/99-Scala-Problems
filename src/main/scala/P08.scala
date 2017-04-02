package org.p99.scala

object P08 {
  /** Eliminate consecutive duplicates of list elements.
    *
    * If a list contains repeated elements they should be replaced
    * with a single copy of the element. The order of the elements
    * should not be changed.
    *
    * @param l the list (with duplicates)
    * @return the list without duplicates
    */
  def compress(l: List[_]): List[_] = {
    l match {
      case Nil => List()
      case last :: Nil => List(last)
      case first :: second :: rest if (first == second) => compress(second +: rest)
      case first :: second :: rest if (first != second) => first +: compress(second +: rest)
    }
  } ensuring(_.length <= l.length)
}
