public class findTargetSumWays {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int c : nums){
            sum += c;
        }
        //a = sum + target / 2
        if((sum + S) % 2 == 1){
            return 0;
        }
        int target = (sum + S) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int c : nums){
            for(int i = dp.length - 1; i >= c; i--){
                if(i >= c){
                    dp[i] += dp[i - c];
                }
            }
        }
        return dp[dp.length - 1];
    }
}
