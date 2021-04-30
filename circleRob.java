public class circleRob {
    public int rob(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length <= 2){
            return nums.length == 1 ? nums[0] : Math.max(nums[0], nums[1]);
        }
        return Math.max(dorob(0,nums.length - 2, nums), dorob(1,nums.length - 1, nums));
    }
    public int dorob(int a, int b,int[] nums){
        int pre1 = 0;
        int pre2 = 0;
        for(int i = a; i < b; i++){
            int cur = Math.max(pre2,pre1 + nums[i]);
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }
}
