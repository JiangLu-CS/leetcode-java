import org.junit.Test;

import java.util.Scanner;

public class longestreverse {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.next();
            int[][] dp = new int[s.length()][s.length()];

            for(int i = 0; i < s.length(); i++){
                for(int j = i; j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 1;
                    }
                }
            }
            // ffakbcbap
            //pabcbkaff
            int min = s.length();
            int cur = s.length();
            for(int i = 0; i < s.length(); i++){
                cur = s.length();
                for(int j = i; j < s.length(); j++){
                    for(int k = s.length() - 1; k > j; k--){
                        while(k >= 0 && j < s.length() && dp[j][k] == 1){
                            cur -= 2;
                            j++;
                            k--;
                        }
                        if(k == j){
                            cur -= 1;
                        }
                    }
                }
                if(min > cur){
                    min = cur;
                }
            }
            System.out.println(min);
        }

    }
}
