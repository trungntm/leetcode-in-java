package com.trungtmnguyen;

public class RemoveDuplicatesFromSortedArrayMain {

  public static void main(String[] args) {

    int[] nums = {1, 1, 1, 2};
    int[] expectedNums = {1, 2}; // The expected answer with correct length

    int k = new Solutions().removeDuplicates(nums); // Calls your implementation
    System.out.printf("k = %d%n", k);
    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
      System.out.printf("nums[%d] = %d%n, expectNums[%d] = %d%n", i, nums[i], i, expectedNums[i]);
    }

  }
}
