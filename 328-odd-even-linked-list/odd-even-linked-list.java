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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy1=new ListNode(-1000001);
        ListNode dummy2=new ListNode(-1000001);
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        ListNode prev=null;
        ListNode first=head;
        ListNode second=head.next;
        while(first!=null && second!=null)
        {
            // prev=first;
            temp1.next=first;
            temp1=first;
            if(first!=null)first=first.next;
            // if(first.next!=null) first=first.next.next;
            // else first=null;
            temp2.next=second;
            temp2=second;
            if(second!=null)second=second.next;
            // if(first!=null) second=first.next;
            // else second=null;
            if(first!=null) first=first.next;
            if(second!=null) second=second.next;

        }
        if(first!=null){
            temp1.next=first;
            temp1=first;
        }
        temp2.next=null;
        temp1.next=dummy2.next;
        return dummy1.next;
    }
}