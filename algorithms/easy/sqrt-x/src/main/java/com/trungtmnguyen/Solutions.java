package com.trungtmnguyen;

public class Solutions {

  public int mySqrt(int x) {
    if (x == 0 || x == 1) {
      return x;
    }

    int left = 1;
    int right = x;

    while (left < right) {
      int mid = (right - left) / 2 + left;
      if ((double) mid * mid >= x) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left * left == x ? left : left - 1;
  }
}
