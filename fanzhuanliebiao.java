public class fanzhuanliebiao {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode last = head.next;
        while(last != null){
            head.next = pre;
            pre = head;
            head = last;
            last = last.next;
        }
        return head;
    }
}
//1->2->3->4->5
//1<-2<-3<-4