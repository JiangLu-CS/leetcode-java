import java.util.*;

public class main {
    public static void main(String[] args) {
        addTwoNumbers he = new addTwoNumbers();
        ListNode l1 = new ListNode(1);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        l5.next = l6;
        he.addTwoNumbers(l1, l5);

        }
        //String[] res = he.permutation(s);
        //System.out.println(Arrays.toString(res));


}
