public class coinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
        ;
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

            for(int j = 0; j < coins.length; j++){
                for(int i = 0; i < dp.length; i++){
                if(i < coins[j]){
                    continue;
                }
                dp[i]  += dp[i - coins[j]];

            }
        }
        return dp[dp.length - 1];
    }
}
