import java.util.LinkedList;

public class CQueue {

    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue(){
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();

    }
    public void appendTail(int value) {
        if(stack1.isEmpty()){
            stack1.push(value);
        }else{
            stack2.push(value);
        }

    }

    public int deleteHead() {
        if(stack2.isEmpty() && stack1.isEmpty()){
            return -1;
        }else if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }
}
