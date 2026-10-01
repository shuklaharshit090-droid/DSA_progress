/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode dummy=new ListNode(-101);
        ListNode temp=dummy;
        int currentval=-101;
        while(head!=null){
          if(head.val!=currentval)
          {
            currentval=head.val;
            temp.next=head;
            temp=head;
          }
          head=head.next;
        }
        temp.next=null;
        return dummy.next;
    }
}