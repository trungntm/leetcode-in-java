package com.trungtmnguyen;

public class LongestPalindromicSubstringMain {

  public static void main(String[] args) {

    String s = "babad";
    Solutions solutions = new Solutions();
    String longestPalindromicSubstring = solutions.longestPalindrome(s);
    System.out.println("The longest palindromic substring in \"" + s + "\" is: \"" + longestPalindromicSubstring + "\"");

    s = "cbbd";
    longestPalindromicSubstring = solutions.longestPalindrome(s);
    System.out.println("The longest palindromic substring in \"" + s + "\" is: \"" + longestPalindromicSubstring + "\"");

    s = "aaa";
    longestPalindromicSubstring = solutions.longestPalindrome(s);
    System.out.println("The longest palindromic substring in \"" + s + "\" is: \"" + longestPalindromicSubstring + "\"");
  }
}
