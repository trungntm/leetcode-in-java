package com.trungtmnguyen;

public class Solutions {

  public String longestCommonPrefix(String[] strs) {

    // Solution 2: Substring and startsWith
    if (strs == null || strs.length == 0) {
      return "";
    }

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }

    return prefix;

//    Solution 2: Find shortest string and compare each character
//    if (strs == null || strs.length == 0) {
//      return "";
//    }
//
//    int index = findIndexOfShortestString(strs);
//
//    char[] array = strs[index].toCharArray();
//    StringBuilder temp = new StringBuilder();
//
//    for (int charIndex = 0; charIndex < array.length; charIndex++) {
//      char currentChar = array[charIndex];
//      boolean allMatch = true;
//
//      for (int i = 0; i < strs.length; i++) {
//        if (i == index) {
//          continue;
//        }
//        if (strs[i].charAt(charIndex) != currentChar) {
//          allMatch = false;
//          break;
//        }
//      }
//
//      if (allMatch) {
//        temp.append(currentChar);
//      } else {
//        break;
//      }
//    }
//
//    return temp.toString();
  }

  private int findIndexOfShortestString(String[] strs) {
    int minLen = strs[0].length();
    int index = 0;
    for (int i = 1; i < strs.length; i++) {
      if (strs[i].length() < minLen) {
        minLen = strs[i].length();
        index = i;
      }
    }
    return index;
  }
}
