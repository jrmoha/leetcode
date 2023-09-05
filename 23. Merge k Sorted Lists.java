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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode cur;
        for(int i=0;i<lists.length;i++){
            cur=lists[i];
            while(cur!=null){
                pq.add(cur.val);
                cur=cur.next;
            }
        }
        ListNode node = new ListNode(-1);
        cur = node;
        while (!pq.isEmpty()) {
            cur.next = new ListNode(pq.poll());
            cur = cur.next;
        }
        return node.next;
    }
}