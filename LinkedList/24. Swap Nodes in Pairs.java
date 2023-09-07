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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode prev=null;
        ListNode node1=head;
        ListNode node2=head.next;
        ListNode head_=node2; 
        while(node1!=null&&node2!=null){
            node1.next=node2.next;
            node2.next=node1;
            if(prev!=null)prev.next =node2;
            prev=node1;
            node1=node1.next;
            if(node1!=null)node2=node1.next;
        }
        return head_;
    }
}