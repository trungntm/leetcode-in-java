package com.trungtmnguyen;

public class Solutions {

  private static final int[] VALUES = new int[256];
  static {
    VALUES['I'] = 1;
    VALUES['V'] = 5;
    VALUES['X'] = 10;
    VALUES['L'] = 50;
    VALUES['C'] = 100;
    VALUES['D'] = 500;
    VALUES['M'] = 1000;
  }

  // XXIV = 24, LCD = 450, LDC = 550, MIVX = 1014, MCMXCIV = 1994
  public int romanToInt(String s) {

    int total = 0;
    int preValue = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char currentChar = s.charAt(i);
      int currentValue = VALUES[currentChar];

      if (currentValue < preValue) {
        total -= currentValue;
      } else {
        total += currentValue;
      }

      preValue = currentValue;
    }

    return total;
  }
}
