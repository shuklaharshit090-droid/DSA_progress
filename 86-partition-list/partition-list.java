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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-101);
        ListNode dummy2=new ListNode(-101);
        ListNode temp=head;
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        while(temp!=null)
        {
            if(temp.val>=x)
            {
                temp2.next=new ListNode(temp.val);
                temp2=temp2.next;
            }
            else{
                temp1.next=new ListNode(temp.val);
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        ListNode t=dummy1;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=dummy2.next;
        return dummy1.next;
    }
}