package com.trungtmnguyen;

public class LengthOfLastWordMain {

  public static void main(String[] args) {

    String s = "Hello World";
    Solutions solutions = new Solutions();
    int result = solutions.lengthOfLastWord(s);
    System.out.printf("Result: %d", result);

    s = "   fly me   to   the moon  ";
    result = solutions.lengthOfLastWord(s);
    System.out.printf("%nResult: %d", result);

    s = "luffy is still joyboy";
    result = solutions.lengthOfLastWord(s);
    System.out.printf("%nResult: %d", result);
  }
}
