import java.util.Arrays;

public class isStraight {
    public boolean isStraight(int[] nums){
        Arrays.sort(nums);
        for(int l = 0, r = nums.length - 1;l < r;){
            if(nums[r] - nums[r - 1] != 1){
                if(nums[l] == 0){
                    l++;
                    nums[r] -= 1;
                }else{
                    return false;
                }
            }else {
                r -= 1;
            }
        }
        return true;
    }
}
