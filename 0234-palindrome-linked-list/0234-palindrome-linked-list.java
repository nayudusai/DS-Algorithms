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
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newNode= reverseList(head.next);
        ListNode temp = head.next;
        head.next = null;
        temp.next=head;
        return newNode;
    }
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
        }
        return slow;
    }
    public Boolean compareNode(ListNode head,ListNode reverse) {
        // ListNode middle = middleNode(head);
        // ListNode reverseNode = reverseList(slow.next);
        while(head != null && reverse != null){
            if(head.val != reverse.val) {
                return false;
            }
            else {
                head = head.next;
                reverse = reverse.next;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode middle = middleNode(head);
        ListNode reverse = reverseList(middle.next);
        boolean result = compareNode(head,reverse);
        return result;
    }
}