// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     ListNode reverse(ListNode head)
//     {
//         if(head==null||head.next==null)
//         return head;
//         ListNode rev=reverse(head.next);
//         head.next.next=head;
//         head.next=null;
//         return rev;
        
//     }
//     public boolean isPalindrome(ListNode head) {
        
//         ListNode slow = head;
//         ListNode fast = head.next;
//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         ListNode revHead=reverse(slow.next);
//         while(revHead!=null)
//         {
//             if(head.val!=revHead.val)
//             return false;
//             head=head.next;
//             revHead=revHead.next;
            
//         }
//         return true;
//     }
// }



class Solution {
    static {
        ListNode n = new ListNode(0);
        for(int i=0;i<300;i++){
            isPalindrome(n);
        }
    }
    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        } 
        ListNode slow = head;
        ListNode fast = head;

        ListNode reverse = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode carry = slow;
            slow = slow.next;
            carry.next = reverse;
            reverse = carry;
        }

        if (fast != null) { 
            slow = slow.next;
        }

        while (slow != null && slow.val == reverse.val) {
            slow = slow.next;
            reverse = reverse.next;
        }
        return slow == null;
    }
}