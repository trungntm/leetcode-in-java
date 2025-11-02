package com.trungtmnguyen;

import java.util.HashSet;
import java.util.Set;

public class Solutions {

  public ListNode modifiedList(int[] nums, ListNode head) {

    Set<Integer> numsSet = new HashSet<>();
    for (int num : nums) {
      numsSet.add(num);
    }

    ListNode resultNode = new ListNode();
    ListNode currentNode = resultNode;


    while (head != null) {
      if (!numsSet.contains(head.val)) {
        currentNode.next = new ListNode(head.val);
        currentNode = currentNode.next;
      }
      head = head.next;
    }

    return resultNode.next;
  }
}
