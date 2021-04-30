public class exchange {
    public int[] exchange(int[] nums){
        if(nums == null){
            return null;
        }if(nums.length <= 1){
            return nums;
        }
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            if(nums[l] % 2 == 1){
                l++;
            }else if(nums[r] % 2 == 1){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if(nums[r] % 2 == 0){
                r--;
            }else if (nums[l] % 2 == 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        return nums;
        }
}
