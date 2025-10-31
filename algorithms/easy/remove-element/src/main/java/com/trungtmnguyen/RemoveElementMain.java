package com.trungtmnguyen;

public class RemoveElementMain {

  public static void main(String[] args) {

    int[] numbs = {3, 2, 2, 3};
    int val = 3;
    Solutions solutions = new Solutions();
    int k = solutions.removeElement(numbs, val);
    System.out.printf("After removing %d, the new length is %d%n", val, k);
    System.out.print("The modified array is: ");
    for (int i = 0; i < k; i++) {
      System.out.print(numbs[i] + " ");
    }
  }
}
