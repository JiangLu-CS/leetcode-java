import java.util.Arrays;
import java.util.Scanner;

public class jixiangshuzi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        boolean[] dp = new boolean[sum + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            dp[i] = true;
            for(int j = arr[i]; j  < sum; j++){
                if((j - arr[i - 1]) % 7 == 0){
                    dp[j - arr[i - 1]] = true;
                    max = Math.max(max, j - arr[i - 1]);
                }
            }

        }
        System.out.println(max);
    }
}
