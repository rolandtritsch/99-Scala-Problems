package org.p99.scala

object P21 {
  /** Insert an element at a given position into a list.
    *
    * @note If the position is 0, the element will prepended to the list.
    *       If the position is the size of the list the element will be
    *       appended to the list.
    *
    * @note The list can be empty, but then the position needs to be 0.
    *
    * @param newElement the element to insert
    * @param atPosition the position to insert the element at
    * @param l the list to insert the elemnt into
    * @tparam T the type of the list elements
    * @return the list with the inserted element
    */
  def insertAt[T](newElement: T, atPosition: Int, l: List[T]): List[T] = {
    require(atPosition >= 0 && atPosition <= l.size)
    require(!l.isEmpty || (l.isEmpty && atPosition == 0))

    val (head, tail) = l.splitAt(atPosition)
    head ::: List(newElement) ::: tail
  } ensuring(_.size == l.size + 1)
}
