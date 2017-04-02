package org.p99.scala

object P11 {
  /** Modified run-length encoding.
    * Modify the result of problem P10 in such a way
    * that if an element has no duplicates it is simply
    * copied into the result list. Only elements with
    * duplicates are transferred as (N, E) terms.
    *
    * @param l the list
    * @return the encoded list
    */
  def encodedModified(l: List[_]): List[_] = {
    require(!l.isEmpty)
    P09.pack(l).map(ll => if (ll.size >= 2) (ll.size, ll(0)) else ll(0))
  } ensuring(_.size <= l.size)
}