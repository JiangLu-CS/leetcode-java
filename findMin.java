public class findMin {
    public int findMin(int[] nums){
        int l = 0;
        int r = nums.length - 1;
        if(nums[r] >= nums[l]){
            return nums[l];
        }
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }if(nums[l] > nums[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
