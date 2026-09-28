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
    public ListNode doubleIt(ListNode head) {
        ListNode temp=head;
        ListNode curr=temp;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int carry=0;
        ListNode dummy=prev;
        while(prev!=null)
        {
            int temp1=prev.val*2+carry;
            prev.val=temp1%10;
            carry=temp1/10;
            prev=prev.next;
        }
        prev=null;
        curr=null;
        next=null;
        while(dummy!=null){
            next=dummy.next;
            dummy.next=prev;
            prev=dummy;
            dummy=next;
        }
        if(carry!=0){
            ListNode temp2=new ListNode(1);
            temp2.next=prev;
            prev=temp2;
        }
        return prev;
    }
}