package org.p99.scala

object P19 {
  /** Rotate a list N places to the left.
    *
    * @note If n is negative, we need to rotate to the right
    * @note n can be a multiple of the size of the list
    *
    * @param n the number of positions to rotate the list
    * @param l the list
    * @return the rotated list
    */
  def rotate(n: Int, l: List[_]): List[_] = {
    val rotateAtIdx = if (n >= 0) n % l.size else l.size + (n % l.size)

    val (head, tail) = l.splitAt(rotateAtIdx)
    tail ::: head
  } ensuring(_.size == l.size)
}
