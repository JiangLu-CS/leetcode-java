import java.util.Scanner;

public class bigDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        String t = s.next();
        System.out.println(solve(ss, t));
    }
    //98701
    //00023
    //98724
    public static String solve(String s, String t){
        int sl = s.length() - 1;
        int tl = t.length() - 1;
        int length;
        if(s.length() > t.length()){
            length = s.length();
        }else{
            length = t.length();
        }
        int[] result = new int[length + 1];
        int flag = 0;
        int count = 0;
        while(count < length || flag == 1){
            int s1 =  sl >= 0 ? s.charAt(sl) - '0' : 0;
            int t1 =  tl >= 0 ? t.charAt(tl) - '0' : 0;
            result[count++] = (s1 + t1 + flag) % 10;
            flag = s1 + t1 + flag>= 10 ? 1 : 0;
            sl--;
            tl--;
        }
        StringBuilder res = new StringBuilder();
        for(int i = result.length - 1; i >= 0 ; i--){
            if(i == 0 && result[i] == 0){
                continue;
            }
            res.append((char)(result[i] + '0'));
        }

        return res.toString();
    }
}
