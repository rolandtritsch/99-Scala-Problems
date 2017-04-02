package org.p99.scala

object P18 {
  /** Extract a slice from a list.
    *
    * Given two indices, I and K, the slice is the list
    * containing the elements from and including the i-th
    * element up to but not including the k-th element of
    * the original list. Start counting the elements with 0.
    *
    * @param fromIdx the index I to start with (inclusive)
    * @param toIdx the index K to stop with (exclusive)
    * @param l the list to process
    * @return the slice of the list
    */
  def slice(fromIdx: Int, toIdx: Int, l: List[_]): List[_] = {
    require(fromIdx >= 0 && fromIdx < l.size)
    require(toIdx >= 0 && toIdx <= l.size)
    require(fromIdx <= toIdx)

    (for(i <- fromIdx until toIdx) yield l(i)).toList
  }
}
