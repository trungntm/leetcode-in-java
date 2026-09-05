package com.trungtmnguyen;

public class ZigZagConversion {
  void main(String[] args) {
    Solutions solutions = new Solutions();

    String s = "PAYPALISHIRING";
    int numRows = 3;
    String result = solutions.convert(s, numRows);
    System.out.printf("The zigzag conversion of \"%s\" with %d rows is: \"%s\"%n", s, numRows, result);

    s = "PAYPALISHIRING";
    numRows = 4;
    result = solutions.convert(s, numRows);
    System.out.printf("The zigzag conversion of \"%s\" with %d rows is: \"%s\"%n", s, numRows, result);

    s = "A";
    numRows = 1;
    result = solutions.convert(s, numRows);
    System.out.printf("The zigzag conversion of \"%s\" with %d rows is: \"%s\"%n", s, numRows, result);
  }
}
