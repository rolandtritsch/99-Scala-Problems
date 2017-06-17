package org.p99.scala

object P29 {

  /** Sorting a list of lists according to length of sublists.
    *
    * We suppose that a list contains elements that are lists themselves. The
    * objective is to sort the elements of the list according to their length.
    * E.g. short lists first, longer lists later, or vice versa.
    *
    * @param l The list of lists to sort
    * @return The list of list (sorted by length; shortest list first)
    */
  def lsort(l: List[List[_]]): List[List[_]] = {
    l.groupBy(_.size).toList.sortBy(_._1).flatMap(_._2)
  }
}
