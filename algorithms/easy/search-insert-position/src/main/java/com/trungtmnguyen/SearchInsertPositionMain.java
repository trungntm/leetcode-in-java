package com.trungtmnguyen;

public class SearchInsertPositionMain {

  public static void main(String[] args) {

    int[] nums = {1,3,5,6};
    int target = 5;

    Solutions solutions = new Solutions();
    int result = solutions.searchInsert(nums, target);
    System.out.printf("Result: %d", result);
  }
}
