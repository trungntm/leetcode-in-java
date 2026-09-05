package com.trungtmnguyen;

public class Solutions {

  public int myAtoi(String s) {
    s = s.trim();
    if (s.isEmpty()) {
      return 0;
    }

    int result = 0;
    int sign = 1;
    int index = 0;

    while (index < s.length()) {
      char c = s.charAt(index);

      if (index == 0 && (c == '+' || c == '-')) {
        sign = c == '-' ? -1 : 1;
        index++;
        continue;
      }

      if (!Character.isDigit(c)) {
        return result * sign;
      }

      int digit = c - '0';
      if (result > (Integer.MAX_VALUE - digit) / 10) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      result = result * 10 + digit;
      index++;
    }
    return result * sign;
  }
}
