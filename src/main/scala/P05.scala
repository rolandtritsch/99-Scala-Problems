package org.p99.scala

import scala.annotation.tailrec

object P05 {
  /** Reverse a list.
    *
    * @note Not using List[_].reverse. Solving this the hard way (with a tailrec).
    *
    * @param l the list
    * @return the reversed list
    */
  def reverse(l: List[_]): List[_] = {
    @tailrec
    def reverseGo(l: List[_], acc: List[_]): List[_] = l match {
      case Nil => acc
      case head :: rest => reverseGo(rest, head +: acc)
    }
    reverseGo(l, List())
  } ensuring(_ == l.reverse)
}
