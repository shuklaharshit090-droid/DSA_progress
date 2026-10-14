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
    public ListNode reverse(ListNode temp)
    {
        ListNode curr=temp;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev1=reverse(l1);
        ListNode prev2=reverse(l2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(prev1!=null||prev2!=null||carry!=0)
        {
            int sum=carry;
            if(prev1!=null){
            sum+=prev1.val;
            prev1=prev1.next;
            }
            if(prev2!=null){
            sum+=prev2.val;
            prev2=prev2.next;
            }
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
        }
        return reverse(dummy.next);
    }
}