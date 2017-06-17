package org.p99.scala

object P28 {

  /** Generalize the predicate from P27 in a way that we can specify a list of group
    * sizes and the predicate will return a list of groups.
    *
    * @param counts The list of counts to create
    * @param l The list to create the counts from
    * @return The list of groups
    */
  def group(counts: List[Int], l: List[_]): List[List[List[_]]] = {
    counts match {
      case Nil => Nil
      case count :: restCounts => {
        val empty = List[List[List[_]]]()
        val combinationsOfCount = P26.combinations(count, l)
        combinationsOfCount.foldLeft(empty) { (acc, combination) =>
          group(restCounts, l.diff(combination)) match {
            case Nil => acc ++ List(List(combination))
            case others => acc ++ others.map(combination :: _)
          }
        }
      }
    }
  }
}
