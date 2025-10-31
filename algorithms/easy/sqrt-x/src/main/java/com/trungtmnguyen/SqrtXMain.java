package com.trungtmnguyen;

public class SqrtXMain {

  public static void main(String[] args) {

    Solutions solutions = new Solutions();
    int result = solutions.mySqrt(8);
    System.out.printf("Result: %d", result);

    result = solutions.mySqrt(2147395600);
    System.out.printf("%nResult: %d", result);
  }
}
