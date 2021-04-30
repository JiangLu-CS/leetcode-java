import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class addTwoNumbers {
    private ListNode head = new ListNode(0);
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1 != null){
            deque1.push(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            deque2.push(temp2.val);
            temp2 = temp2.next;
        }
        int flag = 0;

        while(!deque1.isEmpty() || ! deque2.isEmpty() || flag > 0){
            int a = deque1.isEmpty() ? 0 : deque1.pop();
            int b = deque2.isEmpty() ? 0 : deque2.pop();
            ListNode t1 = head.next;
            head.next = new ListNode((a + b + flag) % 10);
            head.next.next = t1;
            flag = (a + b + flag) >= 10 ? 1 : 0;
        }
        return head.next;
    }

}
