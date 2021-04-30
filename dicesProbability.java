import java.security.interfaces.DSAPublicKey;

public class dicesProbability {
    public double[] dicesProbability(int n){
        int [][] dp  = new int[n + 1][70];
        for(int i = 1; i <= 6; i++){
            dp[1][i] = 1;
        }
        double all = Math.pow(n,6);
        double[] res = new double[n];
        for(int i = 1; i <= n; i++){
            for(int j = i; j < i * 6; j++){
                for(int k = 1; k <=6; k++){
                    if(j < k){
                        break;
                    }
                    dp[i][j] += dp[i - 1][j - k];
                    if(i == n){
                        res[j - i] = dp[n][j] / all;
                    }
                }
            }
        }
        return res;
    }
}
