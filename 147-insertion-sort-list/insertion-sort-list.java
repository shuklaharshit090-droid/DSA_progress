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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            ans.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ans);
        ListNode dummy=new ListNode(-5001);
        ListNode curr=dummy;
        for(int i=0;i<ans.size();i++)
        {
            curr.next=new ListNode(ans.get(i));
            curr=curr.next;
        }
        curr.next=null;
        return dummy.next;
    }
}