package com.trungtmnguyen;

public class PlusOneMain {

  public static void main(String[] args) {

    int[] digits = new int[] {1, 1, 1};
    int[] result = new Solutions().plusOne(digits);
    for (int digit : result) {
      System.out.print(digit + " ");
    }

  }
}
