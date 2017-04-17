package org.p99.scala

object P25 {
  /** Generate a random permutation of the elements of a list.
    *
    * @param l the list to build the permutation from
    * @return the permutated list
    */
  def randomPermute(l: List[_]): List[_] = {
    if(l.isEmpty) List()
    else {
      val oneRandomElement = P23.randomSelect(1, l)
      val listWithoutRandomElement = l.diff(oneRandomElement)
      oneRandomElement ::: randomPermute(listWithoutRandomElement)
    }
  } ensuring(_.size == l.size)
}
