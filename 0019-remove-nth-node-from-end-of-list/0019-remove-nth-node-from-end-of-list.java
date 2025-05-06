class Solution {
    public ListNode removeNthFromEnd(ListNode head, int pos) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer 'pos' steps ahead
        for (int i = 0; i <= pos; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }
}
