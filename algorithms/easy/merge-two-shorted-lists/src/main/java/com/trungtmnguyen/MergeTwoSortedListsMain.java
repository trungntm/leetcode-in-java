package com.trungtmnguyen;

public class MergeTwoSortedListsMain {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
    ListNode l2 = new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7))));

    new Solutions().mergeTwoLists(l1, l2);
  }
}
