public class findRepeatNumber {
    public int findRepeatNumber(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            while(nums[i] > i){
                int temp = nums[nums[i]];
                nums[nums[i]] = temp;
                nums[i] = temp;
            }
            if(nums[i] < i){
                return nums[i];
            }
        }
        return 0;
    }
}
