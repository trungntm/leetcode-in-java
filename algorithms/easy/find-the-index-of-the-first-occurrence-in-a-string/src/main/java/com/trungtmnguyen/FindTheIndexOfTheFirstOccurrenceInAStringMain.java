package com.trungtmnguyen;

public class FindTheIndexOfTheFirstOccurrenceInAStringMain {

  public static void main(String[] args) {

    String haystack = "sadbutsad";
    String needle = "sad";

    int index = new Solutions().strStr(haystack, needle);
    System.out.printf("The index of the first occurrence of \"%s\" in \"%s\" is: %d%n", needle, haystack, index);

    haystack = "leetcode";
    needle = "leeto";
    index = new Solutions().strStr(haystack, needle);
    System.out.printf("The index of the first occurrence of \"%s\" in \"%s\" is: %d%n", needle, haystack, index);

    haystack = "aaa";
    needle = "aaaa";
    index = new Solutions().strStr(haystack, needle);
    System.out.printf("The index of the first occurrence of \"%s\" in \"%s\" is: %d%n", needle, haystack, index);

    haystack = "mississippi";
    needle = "issip";
    index = new Solutions().strStr(haystack, needle);
    System.out.printf("The index of the first occurrence of \"%s\" in \"%s\" is: %d%n", needle, haystack, index);
  }
}
