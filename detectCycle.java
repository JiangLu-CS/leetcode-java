public class detectCycle {
    public ListNode detextCycle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode h1 = head;
        ListNode h2 = head;
        while(h1 != h2){
            if(h2 == null || h2.next == null){
                return null;
            }
            h2 = h2.next.next;
            h1 = h1.next;
        }
        h2 = head;
        while(h1 != h2){
            h1 = h1.next;
            h2 = h2.next;
        }
        return h2;
    }
}
