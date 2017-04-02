package org.p99.scala

object P12 {
  /** Decode a run-length encoded list.
    *
    * Given a run-length code list generated as specified
    * in problem P10, construct its uncompressed version.
    *
    * @param l the encoded list
    * @tparam T the type of the elements that got encoded
    * @return the decoded list
    */
  def decode[T](l: List[(Int, T)]): List[T] = {
    require(!l.isEmpty)
    l.flatMap{case(length, element) => {
      for(i <- 0 to length - 1) yield element
    }}
  } ensuring(_.size >= l.size)
}