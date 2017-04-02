package org.p99.scala

object P09 {
  /** Pack consecutive duplicates of list elements into sublists.
    *
    * If a list contains repeated elements they should be placed
    * in separate sublists.
    *
    * @param l the list with duplicates
    * @return the list of sublists
    */
  def pack[T](l: List[T]): List[List[T]] = {
    def packGo(l: List[T], acc: List[T]): List[List[T]] = {
      l match {
        case Nil => List(acc)
        case last :: Nil => packGo(List(), last +: acc)
        case first :: second :: rest if (first == second) => packGo(second +: rest, first +: acc)
        case first :: second :: rest if (first != second) => List(acc :+ first) ::: packGo(second +: rest, List())
      }
    }
    packGo(l, List())
  }
}
