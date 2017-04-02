package org.p99.scala

object P20 {
  /** Remove the Kth element from a list.
    *
    * Return the list and the removed element in
    * a `Tuple`. Elements are numbered from 0.
    *
    * @note the behaviour to remove an element
    *       from an empty list is undefined
    *
    * @param k position of the element to remove
    * @param l the list to remove the element from
    * @tparam T the type of the element
    * @return the tuple of (List(...), element)
    */
  def removeAt[T](k: Int, l: List[T]): (List[T], T) = {
    require(k >= 0 && k < l.size)
    require(!l.isEmpty)

    val (head, tail) = l.splitAt(k)
    (head ::: tail.drop(1), tail.head)
  } ensuring(_._1.size == l.size - 1)
}
