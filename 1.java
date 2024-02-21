//How to create a Singly Linked List in Java

public class SinglyLinkedList {
  private ListNode head;

private static class ListNode() 
{
  private int data;
  private ListNode next;
  public ListNode(int data) 
  {
    this.data = data;
    this.next = null;
  }
}

public static void main(String args[]) 
{
  SinglyLinkedList ssl = new SinglyLinkedList();
  ssl.head = new ListNode(10);
  ListNode second = new LisstNode(1);
  ListNode third = new ListNode(8);
  ListNode fourth = new ListNode(11);


  ssl.head.next = second;
  second.next = third;
  third.next = fourth;
}
}
