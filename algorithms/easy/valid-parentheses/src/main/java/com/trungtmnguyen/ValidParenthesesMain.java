package com.trungtmnguyen;

public class ValidParenthesesMain {

  public static void main(String[] args) {
    Solutions solutions = new Solutions();

    String s = "()";
    boolean isValid = solutions.isValid(s);
    System.out.printf("The string \"%s\" is valid: %b%n", s, isValid);

    s = "()[]{}";
    isValid = solutions.isValid(s);
    System.out.printf("The string \"%s\" is valid: %b%n", s, isValid);

    s = "(]";
    isValid = solutions.isValid(s);
    System.out.printf("The string \"%s\" is valid: %b%n", s, isValid);

    Solutions2 solutions2 = new Solutions2();

    s = "()";
    isValid = solutions2.isValid(s);
    System.out.printf("The string \"%s\" is valid: %b%n", s, isValid);

    s = "()[]{}";
    isValid = solutions2.isValid(s);
    System.out.printf("The string \"%s\" is valid: %b%n", s, isValid);

    s = "(]";
    isValid = solutions2.isValid(s);
    System.out.printf("The string \"%s\" is valid: %b%n", s, isValid);
  }
}
