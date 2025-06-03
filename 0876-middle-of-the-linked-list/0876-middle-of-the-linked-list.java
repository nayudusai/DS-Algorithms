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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp;
        ListNode ans = null;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null) {
                ans =  slow;
                break;
            }
            else if (fast.next == null) {
                ans =  slow;
                break;
            }
        }
        return ans;
    }
}