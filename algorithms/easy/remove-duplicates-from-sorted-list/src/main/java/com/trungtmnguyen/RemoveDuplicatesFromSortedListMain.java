package com.trungtmnguyen;

public class RemoveDuplicatesFromSortedListMain {

  public static void main(String[] args) {

    ListNode head = new ListNode(0, new ListNode(0, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(5)))))));

    ListNode result = new Solutions2().deleteDuplicates(head);
    while (result != null) {
      System.out.printf("%d ", result.val);
      result = result.next;
    }
  }
}
