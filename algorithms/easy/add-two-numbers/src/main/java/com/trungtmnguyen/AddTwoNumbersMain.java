package com.trungtmnguyen;

public class AddTwoNumbersMain {

  public static void main(String[] args) {

    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

    Solutions solutions = new Solutions();
    ListNode result = solutions.addTwoNumbers(l1, l2);
    System.out.printf("Result: ", result);
  }
}
