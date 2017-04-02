package org.p99.scala

object P10 {
  /** Run-length encoding of a list.
    *
    * Use the result of problem P09 to implement the
    * so-called run-length encoding data compression
    * method. Consecutive duplicates of elements are
    * encoded as tuples (N, E) where N is the number
    * of duplicates of the element E.
    *
    * @param l the list
    * @tparam T the type of the elements in the list
    * @return the encoded list
    */
  def encode[T](l: List[T]): List[(Int, T)] = {
    require(!l.isEmpty)
    P09.pack(l).map((ll: List[T]) => (ll.size, ll(0)))
  } ensuring(_.size <= l.size)
}
