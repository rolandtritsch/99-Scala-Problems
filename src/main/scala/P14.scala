package org.p99.scala

object P14 {
  /** Duplicate the elements of a list.
    *
    * @param l the list
    * @tparam T the type of the elements in the list
    * @return the list with every element duplicated
    */
  def duplicate[T](l: List[T]): List[T] = {
    l match {
      case Nil => Nil
      case element :: rest => element :: element :: duplicate(rest)
    }
  } ensuring (_.size == l.size * 2)
}
