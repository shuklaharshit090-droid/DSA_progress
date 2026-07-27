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
    public static ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nhead1=reverse(l1);
        ListNode nhead2=reverse(l2);
        ListNode temp1=nhead1;
        ListNode temp2=nhead2;
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null || carry!=0)
        {
            int sum=carry;
            if(temp1!=null)
            {
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
                sum+=temp2.val;
                temp2=temp2.next;
            }
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
        }
        return reverse(dummy.next);
    }
}