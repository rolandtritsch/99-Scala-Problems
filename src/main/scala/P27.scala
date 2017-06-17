package org.p99.scala

object P27 {
  /** Group the elements of a set into disjoint subsets.
    *
    * In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3
    * and 4 persons? Write a function that generates all the possibilities.
    *
    * @param l The list to group
    * @return The list of groups
    */
  def group3(l: List[_]): List[List[List[_]]] = {
    P28.group(List(2, 3, 4), l)
  }
}
