package org.p99.scala

object P17 {
  /** Split a list into two parts.
    *
    * The length of the first part is given. Use a `Tuple` for your result.
    *
    * @param n the position to split the list
    * @param l the list
    * @return the split lists
    */
  def split(n: Int, l: List[_]): (List[_], List[_]) = {
    require(n >= 0 && n <= l.size)
    l.splitAt(n)
  } ensuring(t => t._1 ::: t._2 == l)
}
