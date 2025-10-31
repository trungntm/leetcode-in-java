package com.trungtmnguyen;

public class Solutions {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();

    char[] aArr = a.toCharArray();
    char[] bArr = b.toCharArray();

    int i = aArr.length - 1;
    int j = bArr.length - 1;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry >0) {
      int sum = carry;

      if (i >= 0) {
        sum += aArr[i] - '0';
        i--;
      }

      if (j >= 0) {
        sum += bArr[j] - '0';
        j--;
      }

      carry = sum / 2;
      sb.append(sum % 2);
    }

    return sb.reverse().toString();
  }
}
