public class fanzhuanlianbiao {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode l = head;
        ListNode r = head;
        while (--left > 1 && l != null){
            l = l.next;
        }
        while(right-- >= 0 && r != null){
            r = r.next;
        }

        ListNode pre = r;
        ListNode cur = l.next;
        ListNode last = cur.next;
        while(last != null){
            cur.next = pre;
            pre = cur;
            cur = last;
            last = last.next;
        }
        l.next = cur;
        return head;
    }
}
