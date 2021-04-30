import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;
public class echang {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int count = 0;
            while(count < n){
                nums[count++] = scanner.nextInt();
            }
            Arrays.sort(nums);
            int minflag = -1;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < nums.length; i++){
                if(i - 1 >= 0){
                    int temp = nums[i] - nums[i - 1];
                    if(temp < min){
                        min = temp;
                        minflag = i;
                    }
                }
            }
            int minmin = 0;
            int minmax = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[0] == nums[minflag]){
                    minmin++;
                }
                if(nums[minflag + 1] == nums[i]){
                    minmax++;
                }
            }
            int maxmincount = 0;
            int maxmaxcount = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[0] == nums[i]){
                    maxmincount++;
                }
                if(nums[nums.length - 1] == nums[i]){
                    maxmaxcount++;
                }
            }
            int minres = minmin * minmax;
            int max = maxmaxcount * maxmaxcount;
            System.out.println(minres + " " + max);
        }
    }
}
