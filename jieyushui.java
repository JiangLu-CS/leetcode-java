public class jieyushui {
    public static void main(String[] args) {
        trap(new int[]{4,2,0,3,2,5});;
    }
    public static int trap(int[] height) {
        int res = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[right.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i > 0; i--){
            right[i] = Math.max(right[i + 1], height[i]);
        }
        for(int i = 0; i < height.length; i++){
            if(height[i] < left[i] && height[i] < right[i]){
                res += Math.min(left[i], right[i]) - height[i];
            }
        }
        return res;

    }
}
