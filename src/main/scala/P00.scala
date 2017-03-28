package org.p99.scala

object P00 {
  def main(args: Array[String]): Unit = {
    assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }
}