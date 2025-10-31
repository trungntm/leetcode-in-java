package com.trungtmnguyen;

public class Solutions {

  public boolean isPalindrome(int x) {

    if (x < 0) return false;

    int reversed = 0;
    int original = x;

    while (original > 0) {
      int digit = original % 10;
      reversed = reversed * 10 + digit;
      original /= 10;
    }

    return x == reversed;
  }
}
