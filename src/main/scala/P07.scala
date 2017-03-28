package org.p99.scala

object P07 {
  /** Flatten a nested list structure.
    *
    * @param l the list
    * @return the flattened list
    */
  def flatten(l: List[_]): List[_] = l match {
    case List() => List()
    case (headList: List[_]) :: restList => flatten(headList) ::: flatten(restList)
    case headElement :: restList => headElement +: flatten(restList)
  }
}
