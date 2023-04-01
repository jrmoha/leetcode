class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode n = null;
        ListNode t = head;
        while (t != null) {
            ListNode next = t.next;
            t.next = n;
            n = t;
            t = next;
        }
        return n;
    }
}