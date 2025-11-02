package com.trungtmnguyen;

public class Solutions {

  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    int[] index = new int[128]; // ASCII character set

    for (int start = 0, end = 0; end < n; end++) {
      start = Math.max(index[s.charAt(end)], start);
      ans = Math.max(ans, end - start + 1);
      index[s.charAt(end)] = end + 1;
    }

    return ans;
  }
}
