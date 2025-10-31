package com.trungtmnguyen;

public class LongestCommonPrefixMain {

  public static void main(String[] args) {
    Solutions solutions = new Solutions();

    String[] strs = new String[]{"flower","flow","flight"};
    String output = solutions.longestCommonPrefix(strs);
    System.out.printf("The longest common prefix of the strings is: \"%s\"%n", output);
  }
}
