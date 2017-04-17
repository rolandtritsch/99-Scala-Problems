package org.p99.scala

object P26 {
  /** Generate the combinations of K distinct objects chosen from the N elements
    * of a list.
    *
    * In how many ways can a committee of 3 be chosen from a group of 12 people?
    * We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the
    * well-known binomial coefficient). For pure mathematicians, this result may
    * be great. But we want to really generate all the possibilities.
    *
    * Algorithm goes like this:
    *
    * - (Recursively) Build a/the list of all combinations List(List(0, 0),
    * (0, 1), (1, 0), (1, 1), ...)
    * - But remove the once with duplicate elements (0, 0), (1, 1)
    * - And remove all duplicate combinations (by sorting/distinct the
    * combinations) List(List(0, 1), List(1, 0)) -> List(List(0, 1))
    *
    * @param k how many elements do we want to combine
    * @param l the list of elements to choose from
    * @return the list of combinations
    */
  def combinations[T <% Ordered[T]](k: Int, l: List[T]): List[List[T]] = {
    require(k >= 0 && k <= l.size)
    require(!l.isEmpty || k == 0)

    if (k == 0) List()
    else if (k == 1) for (e <- l) yield List(e)
    else {
      val all = for {
        e <- l
        c <- combinations(k - 1, l)
        if (!c.contains(e))
      } yield (List(e) ::: c).sorted
      all.distinct
    }
  }
}
