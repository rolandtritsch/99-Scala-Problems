package org.p99.scala

object P06 {
  /** Find out whether a list is a palindrome.
    *
    * @param l - the list
    * @return True, if the list is a palindroms
    */
  def isPalindrome(l: List[Char]): Boolean = {
    l == l.reverse
  } ensuring(_ || l != l.reverse)
}
