public class hasCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode i = head,j = head.next;
        while(i != null && j != null && i.next != null && j.next != null){
            if(i == j){
                return true;
            }
            i = i.next;
            j = j.next.next;
        }
        return false;
    }

}
