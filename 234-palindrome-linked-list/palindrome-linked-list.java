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
    public boolean isPalindrome(ListNode head) {
     ListNode temp=head;
     ListNode slow=head;
     ListNode fast=head;
     while(fast!=null && fast.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     }
     ListNode prev=null;
     ListNode next=null;
     while(slow!=null)
     {
        next=slow.next;
        slow.next=prev;
        prev=slow;
        slow=next;
     }
     ListNode t1=prev;
     ListNode t2=head;
     while(t1!=null && t2!=null)
     {
        if(t1.val!=t2.val)
        {
            return false;
        }
        t1=t1.next;
        t2=t2.next;
     }
     return true;
    }
}