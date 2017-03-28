package org.p99.scala

object P00 {
  def main(args: Array[String]): Unit = {
    print("P01"); assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
    print("/P02"); assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    print("/P03"); assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
    println()
  }
}