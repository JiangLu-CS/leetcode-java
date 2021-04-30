import java.util.HashMap;
import java.util.Map;

public class copyRandomList {
    private HashMap<Node, Node> temp = new HashMap();
    static class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node result = new Node(head.val);
        Node t = result;
        Node help = head;
        do{
            t.next = new Node(help.next.val);
            temp.put(help,t);
            t = t.next;
            help = help.next;
        }while(help.next != null);
        help = head;
        t = result;
        while(help.next != null){
            t.random = temp.get(help.random);
            t = t.next;
            help = help.next;
        }
        return result;
    }
}
