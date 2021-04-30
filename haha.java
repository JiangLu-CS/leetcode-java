import java.util.Stack;

public class haha {
    public static void main(String[] args) {
        reverseWords("the sky is blue");
    }
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            if(i >= 1 && s.charAt(i) == ' ' && s.charAt(i - 1) != ' '){
                stack.push(sb.toString());
                sb= new StringBuilder();
            }else if(s.charAt(i) == ' '){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();


    }
}
