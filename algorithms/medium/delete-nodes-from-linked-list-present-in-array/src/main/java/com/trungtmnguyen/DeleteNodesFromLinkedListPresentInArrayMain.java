package com.trungtmnguyen;

public class DeleteNodesFromLinkedListPresentInArrayMain {

  public static void main(String[] args) {

    // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    int[] nums = new int[]{2, 3};

    head = new Solutions2().modifiedList(nums, head);
    System.out.printf("Modified linked list after deleting nodes present in array: ");
  }

}
