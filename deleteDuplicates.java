public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        p.next = deleteDuplicates(p.next);
        if (p.val == p.next.val) {
            p = p.next;
        }
        return head;
    }
}
