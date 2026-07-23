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
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode>ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            ans.add(temp);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int i=ans.size()-1;i>=0;i--)
        {
            curr.next=ans.get(i);
            curr=ans.get(i);
        }
        curr.next=null;
        return dummy.next;
    }
}