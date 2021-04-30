public class checkPossibility {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <=2){
            return true;
        }
        if(nums.length == 3){
            return nums[0] <= nums[1] || nums[1] <= nums[2];
        }
        int count = 0;

            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] < nums[i - 1]) {
                    if (i > 1 && nums[i] < nums[i - 2] && nums[i + 1] < nums[i - 2]) {
                        return false;
                    }
                    count++;
                }
                if(count > 2){
                    return false;
                }
            }
        return true;




    }
}
