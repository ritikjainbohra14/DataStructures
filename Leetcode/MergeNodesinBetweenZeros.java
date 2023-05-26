public class MergeNodesinBetweenZeros {

 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode head2 = new ListNode(0);
        ListNode curr = head2;
       ListNode first = head;
       ListNode second = head.next;

    while(second != null && second.next != null){

       while(second.val != 0){
           second = second.next;
       }

       ListNode a = first.next;
       if(first.val == 0 && second.val == 0){
           int m = 0;
           while(a != second){
             m += a.val; 
             a = a.next;
           }
           curr.next= new ListNode(m);
           curr = curr.next;
       }

        first = second;
        second = second.next;
       }

    return head2.next;

    }
}
}
