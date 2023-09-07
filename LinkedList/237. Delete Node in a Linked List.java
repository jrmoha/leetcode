/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev=null;
         while(node.next!=null){
             int t=node.val;
             node.val=node.next.val;
             node.next.val=t;
             prev=node;
             node=node.next;
         }
         prev.next=null;
    }
}