package org.p99.scala

object P00 {
  def main(args: Array[String]): Unit = {
    val l0 = List(1, 1, 2, 3, 5, 8)
    print("P01"); assert(P01.last(l0) == 8)
    print("/P02"); assert(P02.penultimate(l0) == 5)
    print("/P03"); assert(P03.nth(2, l0) == 2)
    print("/P04"); assert(P04.length(l0) == 6)
    print("/P05"); assert(P05.reverse(P05.reverse(l0)) == l0)
    print("/P06"); assert(P06.isPalindrome("racecar".toList))
    print("/P07"); assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == l0)
    print("/P08"); assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
    print("/P09"); assert(P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    print("/P10"); assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    print("/P11"); assert(P11.encodedModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    print("/P12"); assert(P12.decode(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    print("/P13"); assert(P12.decode(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    print("/P14"); assert(P14.duplicate(List(1, 2, 3)) == List(1, 1, 2, 2, 3, 3))
    print("/P15"); assert(P15.duplicateN(3, "abc".toList) == "aaabbbccc".toList)
    print("/P16"); assert(P16.drop(1, List(1, 2, 3)) == List())
    print("/P17"); assert(P17.split(2, List(1, 1, 2 , 2)) == (List(1, 1), List(2, 2)))
    print("/P18"); assert(P18.slice(0, 2, List(1, 2, 3)) == List(1, 2))
    print("/P19"); assert(P19.rotate(1, List(1, 2, 3)) == List(2, 3, 1))
    print("/P20"); assert(P20.removeAt(0, List(1, 2, 3)) == (List(2, 3), 1))
    print("/P21"); assert(P21.insertAt(1, 0, List(2, 3)) == List(1, 2, 3))
    println()
  }
}