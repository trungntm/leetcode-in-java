package com.trungtmnguyen;

public class RomanToIntegerMain {

  public static void main(String[] args) {
    Solutions solutions = new Solutions();
    String romanNumeral = "MCMXCIV";
    int result = solutions.romanToInt(romanNumeral);
    System.out.printf("The integer value of the Roman numeral %s is: %d%n", romanNumeral, result);

    romanNumeral = "XXIV";
    result = solutions.romanToInt(romanNumeral);
    System.out.printf("The integer value of the Roman numeral %s is: %d%n", romanNumeral, result);
  }
}
