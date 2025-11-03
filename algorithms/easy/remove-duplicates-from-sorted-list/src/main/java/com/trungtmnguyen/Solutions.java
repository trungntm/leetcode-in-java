package com.trungtmnguyen;

public class Solutions {

  public ListNode deleteDuplicates(ListNode head) {

    ListNode dummy = new ListNode(0);
    ListNode currentNode = dummy;

    while (head != null) {
      if (head.next == null || head.val != head.next.val) {
        currentNode.next = new ListNode(head.val);
        currentNode = currentNode.next;
      }

      head = head.next;
    }

    currentNode.next = null;
    return dummy.next;
  }
}
