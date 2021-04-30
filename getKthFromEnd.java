public class getKthFromEnd {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode getKthFromEnd(ListNode head, int k){
        if(k <= 0){
            return null;
        }
        ListNode one = head;
        ListNode two = head;
        while(k-- > 1){
            if(one.next == null){
                return null;
            }
            one = one.next;
        }
        while(one.next != null){
            one = one.next;
            two = two.next;
        }
        return two;
    }
}

// 1 2 3
//2
//