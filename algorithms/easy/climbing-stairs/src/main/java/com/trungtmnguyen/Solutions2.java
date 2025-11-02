package com.trungtmnguyen;

/*
 * n = 1 -> 1
 * n = 2 -> 2
 * n = 3 -> 3 (1 + 2)
 * n = 4 -> 5 (2 + 3)
 * n = 5 -> 8 (3 + 5)
 * Solution: steps[n] = steps[n-1] + steps[n-2] (Bottom up)
* */
public class Solutions2 {

  public int climbStairs(int n) {
    if (n == 1 || n ==2) {
      return n;
    }

    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;

    // Bottom up
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }
}
