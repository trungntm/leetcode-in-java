package com.trungtmnguyen;

public class AddBinaryMain {

  public static void main(String[] args) {

    String a = "1010";
    String b = "1011";

    Solutions solutions = new Solutions();
    String result = solutions.addBinary(a, b);
    System.out.printf("Result: %s", result);

    a = "11";
    b = "1";
    result = solutions.addBinary(a, b);
    System.out.printf("%nResult: %s", result);
  }
}
