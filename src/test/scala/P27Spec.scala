package org.p99.scala

import org.scalatest._

class P27Spec extends FlatSpec {
  import P27._

  "group3(List(...))" should "return the correct groups, for the given testcase" in {
    val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    assert(group3(l).size === 1260)
  }
}
