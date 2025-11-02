package com.trungtmnguyen;

public class RemoveLinkedListElementsMain {

  public static void main(String[] args) {

    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    int val = 5;

    head = new Solutions().removeElements(head, val);
    System.out.printf("Linked list after removing elements with value %d: ", val);
//
//    head = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
//    val = 7;
//
//    head = new Solutions().removeElements(head, val);
//    System.out.printf("Linked list after removing elements with value %d: ", val);

  }
}
