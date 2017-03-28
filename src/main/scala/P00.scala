package org.p99.scala

object P00 {
  def main(args: Array[String]): Unit = {
    val l = List(1, 1, 2, 3, 5, 8)
    print("P01"); assert(P01.last(l) == 8)
    print("/P02"); assert(P02.penultimate(l) == 5)
    print("/P03"); assert(P03.nth(2, l) == 2)
    print("/P04"); assert(P04.length(l) == 6)
    print("/P05"); assert(P05.reverse(P05.reverse(l)) == l)
    print("/P06"); assert(P06.isPalindrome("racecar".toList))
    print("/P07"); assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == l)
    println()
  }
}