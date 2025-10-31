package com.trungtmnguyen;

public class LongestSubstringWithoutRepeatingCharactersMain {

  public static void main(String[] args) {
    Solutions solutions = new Solutions();

    String s = "abcabcbb";
    int length = solutions.lengthOfLongestSubstring(s);
    System.out.printf("The length of the longest substring without repeating characters in \"%s\" is %d%n", s, length);

    s = "bbbbb";
    length = solutions.lengthOfLongestSubstring(s);
    System.out.printf("The length of the longest substring without repeating characters in \"%s\" is %d%n", s, length);

    s = "pwwkew";
    length = solutions.lengthOfLongestSubstring(s);
    System.out.printf("The length of the longest substring without repeating characters in \"%s\" is %d%n", s, length);

    s = "au";
    length = solutions.lengthOfLongestSubstring(s);
    System.out.printf("The length of the longest substring without repeating characters in \"%s\" is %d%n", s, length);
  }
}
