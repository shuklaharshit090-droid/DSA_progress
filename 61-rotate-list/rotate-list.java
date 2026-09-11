class Solution {
    public int length(ListNode temp)
    {
        int count = 0;

        while(temp != null)
        {
            temp = temp.next;
            count++;
        }

        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return null;
        if(head.next == null) return head;

        int n = length(head);

        k = k % n;

        if(k == 0) return head;

        ListNode slow2 = head;

        for(int i = 0; i < n-k-1; i++)
        {
            slow2 = slow2.next;
        }

        ListNode temp = slow2.next;

        slow2.next = null;

        ListNode dummy = temp;

        while(dummy.next != null)
        {
            dummy = dummy.next;
        }

        dummy.next = head;

        return temp;
    }
}