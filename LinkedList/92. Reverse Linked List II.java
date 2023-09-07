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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right)return head;
         Stack<ListNode> stk = new Stack<>();
        ListNode d=new ListNode(-9999);
        ListNode d_cur=d;
        ListNode slow=head;
        for(int i=1;i<left;i++){
            d_cur.next=new ListNode(slow.val);
            d_cur=d_cur.next;
            slow=slow.next;
        }
        stk.push(slow);slow=slow.next;
       for(int i=0;slow!=null&&i<right-left;i++){
           stk.push(slow);slow=slow.next;
       }
       while(!stk.isEmpty()){
           d_cur.next=new ListNode(stk.pop().val);
           d_cur=d_cur.next;
       }
       while(slow!=null){
           d_cur.next=slow;
           d_cur=d_cur.next;
           slow=slow.next;
       }
        return d.next;
    }
}