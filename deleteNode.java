public class deleteNode {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
    public ListNode deleteNode(ListNode head, int val){
        if(head == null){
            return null;
        }
        if(head.val == val){
            if(head.next == null){
                return null;
            }
            return head.next;
        }
        ListNode h = head;
        ListNode l = head.next;
        while(l.val != val){
            l = l.next;
            h = h.next;
        }
        h.next = l.next;
        return head;
    }
}
