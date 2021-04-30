import java.util.PriorityQueue;

public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int r = nums2.length;
        int m = (l + r + 1) / 2;
        int n = (l + r + 2) / 2;
        return (median(nums1, 0, nums2, 0, m) + median(nums1, 0, nums2, 0, n))/ 2.0;
    }
    public int median(int[] nums1, int i, int[] nums2, int j, int k){
        if(i >= nums1.length){
            return nums2[j - k + 1];
        }
        if(j >= nums2.length){
            return nums1[i - k + 1];
        }
        if(k == 1){
            return Math.min(nums1[i], nums2[j]);
        }
        if(i + k / 2 - 1 < 0){
            return median(nums1, i, nums2, j + k / 2, k - k / 2);
        }
        if(j + k / 2 - 1 < 0){
            return median(nums1, i + k / 2, nums2, j, k - k / 2);
        }
        int midval1 = nums1[i + k / 2 - 1];
        int midval2 = nums2[j + k / 2 - 1];
        if(midval1 < midval2){
            return median(nums1, i + k / 2, nums2, j, k - k / 2);
        }else{
            return median(nums1, i, nums2, j + k / 2, k - k / 2);
        }
    }
}
