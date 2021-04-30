import java.util.*;

public class LRU {
    private class DoubleNode {
        int val;
        DoubleNode next;
        DoubleNode front;
        DoubleNode head = new DoubleNode(0,0);
        DoubleNode tail = new DoubleNode(0,0);
        int key;

        public DoubleNode removeLast() {
            DoubleNode temp = tail.front;
            tail.front = tail.front.front;
            tail.front.next = tail;
            return temp;
        }

        public void addFirst() {
            this.next = head.next;
            head.next.front = this;
            head.next = this;
            this.front = head;
        }

        public void removeToFirst() {
            this.remove();
            this.addFirst();
        }

        public void remove() {
            this.front.next = this.next;
            this.next.front = this.front;
        }

        DoubleNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.front = null;
            this.next = null;
            head.next = tail;
            tail.front = head;
        }
    }



    public int[] LRU (int[][] operators, int k) {
        int cur = 0;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, DoubleNode> map = new HashMap<>();
        for(int i = 0; i < operators.length; i++){
            if(operators[i][0] == 1){
                if(map.containsKey(operators[i][1])) {
                    map.get(operators[i][1]).removeToFirst();
                    map.get(operators[i][1]).val = operators[i][2];
                    continue;
                }
                DoubleNode neww = new DoubleNode(operators[i][1], operators[i][2]);
                if(k >= map.size()){
                    map.remove(neww.removeLast().key);
                }
                map.put(operators[i][1], neww);
                neww.addFirst();
                continue;
                }
            if(operators[i][0] == 2){
                if(map.containsKey(operators[i][1])){
                    map.get(operators[i][1]).removeToFirst();
                    res.add(map.get(operators[i][1]).val);
                    continue;
                }
                res.add(-1);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
        // write code here
    }
}
