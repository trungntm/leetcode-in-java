package com.trungtmnguyen;

public class Solutions {

  public ListNode removeElements(ListNode head, int val) {

    ListNode dummyHead = new ListNode(0);
    ListNode currentNode = dummyHead;

    boolean[] exists = new boolean[val + 1];
    exists[val] = true;

    while (head != null) {

      if (head.val > val || !exists[head.val]) {
        currentNode.next = head;
        currentNode = currentNode.next;
      }

      head = head.next;
    }

    currentNode.next = null;
    return dummyHead.next;
  }
}
