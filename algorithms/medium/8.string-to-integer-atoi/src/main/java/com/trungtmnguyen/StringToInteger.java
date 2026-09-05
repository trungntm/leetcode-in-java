package com.trungtmnguyen;

public class StringToInteger {

  void main(String[] args) {
    String s = "42";
    Solutions solutions = new Solutions();
    System.out.println(solutions.myAtoi(s));

    s = "   -42";
    System.out.println(solutions.myAtoi(s));

    s = "4193 with words";
    System.out.println(solutions.myAtoi(s));
  }
}
