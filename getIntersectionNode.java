import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class getIntersectionNode {
    public ListNode getInteresectionNode(ListNode headA, ListNode headB){
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != tempB){
            tempA = tempA.next == null? tempA.next : headB;
            tempB = tempB.next == null? tempB.next : headA;
        }
        return tempA;
    }
}
