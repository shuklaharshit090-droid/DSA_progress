/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      ListNode dummy=new ListNode(-1001);
      ListNode temp=dummy;
      temp.next=node.next;
      node.val=temp.next.val;
      node.next=node.next.next;  
    }
}