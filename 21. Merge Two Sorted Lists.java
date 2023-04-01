class Solution {
  public   ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode n=new ListNode(0);
ListNode d=n;
while(list1!=null&&list2!=null){
    if(list1.val<=list2.val){
        d.next=list1;
        list1=list1.next;
    }else{
        d.next=list2;
        list2=list2.next;
    }
    d=d.next;
}
if(list1!=null)d.next=list1;
if(list2!=null)d.next=list2;
return n.next;
      }
}