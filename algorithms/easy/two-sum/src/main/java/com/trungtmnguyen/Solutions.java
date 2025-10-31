package com.trungtmnguyen;

import java.util.HashMap;
import java.util.Map;

public class Solutions {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      System.out.printf("Looking for %d to pair with %d%n", complement, nums[i]);
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      System.out.printf("Storing %d at index %d%n", nums[i], i);
      map.put(nums[i], i);
    }
    return new int[0];
  }
}
