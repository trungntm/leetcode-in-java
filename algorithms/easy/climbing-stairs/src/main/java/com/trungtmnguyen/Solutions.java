package com.trungtmnguyen;

/*
* n = 1 -> 1
* n = 2 -> 2
* n = 3 -> 3 (1 + 2)
* n = 4 -> 5 (2 + 3)
* n = 5 -> 8 (3 + 5)
* Solution: F(n) = F(n-1) + F(n-2) (Recursion)
* */

public class Solutions {

  public int climbStairs(int n) {

    if (n == 1 || n ==2) {
      return n;
    }

    return climbStairs(n-1) + climbStairs(n-2);
  }
}
