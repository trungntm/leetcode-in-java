package com.trungtmnguyen;

public class Solutions {

  public int removeDuplicates(int[] nums) {

    int k = 0;

    for (int i = 0; i < nums.length; i++) {
      System.out.printf("k=%d%n, i=%d%n", nums[k], nums[i]);
      if (nums[i] != nums[k]) {
        nums[++k] = nums[i];
      }
    }

    return k + 1;
  }
}
