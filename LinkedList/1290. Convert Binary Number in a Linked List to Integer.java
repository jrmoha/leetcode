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
    public int getDecimalValue(ListNode head) {
        int base=0;
        ListNode cur=head;
        while(cur!=null){
            base++;
            cur=cur.next;
        }
        if(base>0)base--;
        int dec=0;
        cur=head;
        while(cur!=null){
            dec+=(cur.val*Math.pow(2, base));
            base--;
            cur=cur.next;
        }
        return dec;
    }
}