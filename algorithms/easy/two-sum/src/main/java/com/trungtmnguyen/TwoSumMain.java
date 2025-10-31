package com.trungtmnguyen;

public class TwoSumMain {

  public static void main(String[] args) {
    Solutions solutions = new Solutions();

    int[] inputs = {2, 7, 11, 15};
    int target = 9;
    int[] result = solutions.twoSum(inputs, target);
    System.out.printf("[%d, %d]%n", result[0], result[1]);

    inputs = new int[]{3, 2, 4};
    target = 6;
    result = solutions.twoSum(inputs, target);
    System.out.printf("[%d, %d]%n", result[0], result[1]);

    inputs = new int[]{3, 3};
    target = 6;
    result = solutions.twoSum(inputs, target);
    System.out.printf("[%d, %d]%n", result[0], result[1]);

    inputs = new int[]{2, 7, 11, 15};
    target = 22;
    result = solutions.twoSum(inputs, target);
    System.out.printf("[%d, %d]%n", result[0], result[1]);
  }
}
