package com.trungtmnguyen;

public class LongestSubstringWithoutRepeatingCharactersMain {

  public static void main(String[] args) {

    String s = "abcabcbb";
    Solutions solutions = new Solutions();
    int length = solutions.lengthOfLongestSubstring(s);
    System.out.println("The length of the longest substring without repeating characters in \"" + s + "\" is: " + length);
  }
}
