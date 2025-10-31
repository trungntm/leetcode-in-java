package com.trungtmnguyen;

public class Solutions {

  public int[] plusOne(int[] digits) {
    int carry = 1;
    int[] sumArr = new int[digits.length];

    int length = digits.length;
    int index = sumArr.length - 1;

    while (length > 0) {
      int sum = digits[length -1] + carry;
      carry = sum / 10;
      sumArr[index] = sum % 10;
      length--;
      index--;
    }

    if (carry > 0) {
      int[] sumArray2 = new int[digits.length + 1];
      sumArray2[0] = carry;

      System.arraycopy(sumArr, 0, sumArray2, 1, sumArr.length);
      return sumArray2;
    }

    return sumArr;
  }
}
