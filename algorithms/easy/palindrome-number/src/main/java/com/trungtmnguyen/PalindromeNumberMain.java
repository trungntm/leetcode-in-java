package com.trungtmnguyen;

public class PalindromeNumberMain {

  public static void main(String[] args) {
    Solutions solutions = new Solutions();
    System.out.println(solutions.isPalindrome(121)); // true
    System.out.println(solutions.isPalindrome(-121)); // false
    System.out.println(solutions.isPalindrome(10)); // false
  }
}
