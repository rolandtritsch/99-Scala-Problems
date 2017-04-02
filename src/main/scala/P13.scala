package org.p99.scala

object P13 {
  /** Run-length encoding of a list (direct solution).
    *
    * Implement the so-called run-length encoding data
    * compression method directly. I.e. don't use other
    * methods you've written (like P09's pack); do all
    * the work directly.
    *
    * @param l the list to encode
    * @tparam T the type of the elements in the list
    * @return the encoded list
    */
  def encodeDirect[T](l: List[T]): List[(Int, T)] = {
    if (l.isEmpty) List()
    else {
      val head = l.takeWhile(_ == l(0))
      (head.size, head(0)) :: encodeDirect(l.dropWhile(_ == l(0)))
    }
  } ensuring (_.size <= l.size)
}
