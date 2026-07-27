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
    ListNode less=new ListNode(-101); 
    ListNode les=less;
    ListNode more=new ListNode(-101);
    ListNode mor=more;
    ListNode temp=head;
    while(temp!=null)
    {
        if(temp.val<x)
        {
            less.next=new ListNode(temp.val);
            less=less.next;
        }
        else{
            more.next=new ListNode(temp.val);
            more=more.next;
        }
        temp=temp.next;
    }
    ListNode dummy=new ListNode(-101);
    ListNode curr=dummy;
    while(les.next!=null)
    {
        curr.next=les.next;
        curr=curr.next;
        les=les.next;
    }   
    while(mor.next!=null)
    {
        curr.next=mor.next;
        curr=curr.next;
        mor=mor.next;
    }
    curr.next=null;
    return dummy.next;
    }
}