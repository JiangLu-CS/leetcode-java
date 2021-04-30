import java.util.Random;

public class fingKthLargest {
    public static Random random = new Random();
    public static int findKthLargest(int[] nums, int k){
        int left = 0;
        int right = nums.length;
        while(true){
            int index = quicksort(nums, left, right);
            if( index== nums.length - k){
                return nums[index];
            }else if(index < k){
                index = quicksort(nums, index + 1, right);
            }else {
                index = quicksort(nums, left, index - 1);
            }
        }

    }
    public static int quicksort(int[] nums, int l, int r){
        if(r > l){
            int ramdom = l + random.nextInt(r - l) + 1;
            int temp = nums[ramdom];
            nums[ramdom] = nums[l];
            nums[l] = temp;
        }

        int key = nums[l];
        while(l < r){
            if(l < r && key < nums[r]){
                r--;
            }
            nums[l] = nums[r];
            if(l < r && key >= nums[l]){
                l++;
            }
            nums[r] = nums[l];
        }
        nums[l] = key;
        return l;
    }
}
