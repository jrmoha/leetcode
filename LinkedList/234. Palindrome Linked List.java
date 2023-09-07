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
        ListNode t = head;
        ListNode n = null;
        while (t != null) {
            ListNode next = t.next;
            t.next = n;
            n = t;
            t = next;
        }
        return n;
    }
public boolean isPalindrome(ListNode head) {
        if(head==null)return false;
        if(head.next==null)return true;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = this.reverseList(slow);
        ListNode cur_head = head, cur_rev = rev;
        while (cur_head != null&&cur_rev!=null) {
            if (cur_head.val != cur_rev.val) {
                return false;
            }
            cur_head = cur_head.next;
            cur_rev = cur_rev.next;
        }
        return true;
    }
}