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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        for(int i=0;i<a-1;i++)
        {
         temp=temp.next;
        }
        ListNode temp2=temp;
        for(int i=a-1;i<=b;i++){
            temp2=temp2.next;
        }
        while(list2!=null)
        {
            temp.next=list2;
            temp=list2;
            list2=list2.next;
        }
        temp.next=temp2;
        return list1;
    }
}