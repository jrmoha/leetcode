public ListNode swapNodes(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode target1 = head;
        ListNode target2 = head;
        ListNode prev1 = null;
        ListNode prev2 = null;
        ListNode d2 = head;
        for (int i = 1; target1 != null && i < k; i++) {
            prev1 = target1;
            target1 = target1.next;
            d2 = d2.next;
        }
        while (d2.next != null) {
            prev2 = target2;
            target2 = target2.next;
            d2 = d2.next;
        }
        if(prev1!=null)prev1.next=target2;
         else head=target2;
         if(prev2!=null)prev2.next=target1;
         else head=target1;
        ListNode t=target1.next;
        target1.next=target2.next;
        target2.next=t;

         return head;
    }