package org.p99.scala

object P30 {

  /** Again, we suppose that a list contains elements that are lists themselves. But
    * this time the objective is to sort the elements according to their length
    * frequency; i.e. in the default, sorting is done ascendingly, lists with rare
    * lengths are placed first, others with a more frequent length come later.
    *
    * @param l The list to sort
    * @return The sorted list
    */
  def lsortFreq(l: List[List[_]]): List[List[_]] = {
    l.groupBy(_.size).toList.sortBy(_._2.size).flatMap(_._2)
  }
}
