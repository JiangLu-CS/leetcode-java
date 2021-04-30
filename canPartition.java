public class canPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int c : nums){
            sum += nums[c];
        }
        if(sum % 2 == 1){
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        for(int i = 0; i < nums.length; i++){
            for(int j = target; j >= nums[i]; j--){
                dp[j] |= dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}
