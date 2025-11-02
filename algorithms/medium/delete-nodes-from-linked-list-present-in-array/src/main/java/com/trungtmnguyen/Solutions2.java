package com.trungtmnguyen;

public class Solutions2 {

  public ListNode modifiedList(int[] nums, ListNode head) {
    int maxSize = -1;

    for (int num : nums) {
      maxSize = Math.max(maxSize, num);
    }

    boolean[] visited = new boolean[maxSize + 1];

    for (int num : nums) {
      visited[num] = true;
    }

    ListNode resultNode = new ListNode();
    ListNode currNode = resultNode;

    while (head != null) {
      if (head.val > maxSize ||!visited[head.val]) {
        currNode.next = head;
        currNode = currNode.next;
      }

      head = head.next;
    }

    currNode.next = null;
    return resultNode.next;
  }
}
