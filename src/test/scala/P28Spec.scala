package org.p99.scala

import org.scalatest._

class P28Spec extends FlatSpec {
  import P28._

  //"group(List(counts), List(...))" should "return the correct groups, for the given testcase" in {
  ignore should "return the correct groups, for the given testcase" in {
    val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    val result = List(List(List()))
    assert(group(List(2, 3, 4), l) === result)
  }

  "group(List(), List(...)" should "return an empty list" in {
    val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    assert(group(List(), l) === List())
  }

  "group(List(0), List(...)" should "return an empty list" in {
    val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    assert(group(List(0), l) === List())
  }

  "group(List(1), List(...)" should "return a/the list of groups with every element in it" in {
    val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    val result =  l.map(e => List(List(e)))
    assert(group(List(1), l) === result)
  }

  "group(List(3), List(...)" should "return a/the list with the correct number of groups in it" in {
    assert(group(List(3), (0 to 11).toList).size === 220)
  }

  "group(List(2, 3, 4), List(...)" should "return a/the list of the correct groups in it" in {
    val l = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    assert(group(List(2, 3, 4), l).size === 1260)
  }
}

