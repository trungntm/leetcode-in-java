package com.trungtmnguyen;

public class Solutions {

  public int lengthOfLastWord(String s) {

    s = s.trim();
    String[] words = s.split(" ");
    int len = words.length;
    return words[len - 1].length();
  }
}
