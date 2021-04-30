import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class leastDistance {


    private static int res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        Set<Integer> set = new HashSet<>();
        set.add(0);
        addmin(arr, 0, 0, set);
        System.out.println(res);
    }
    public static void addmin(int[][]arr, int now, int count, Set set){
        if(count == arr.length - 1){
           res += arr[now][0];
           return;
        }
        int min = Integer.MAX_VALUE;
        int next = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[now][i] != 0 && !set.contains(i)){
                if(arr[now][i] < min){
                    min = arr[now][i];
                    next = i;
                }
            }
        }
        res += min;
        set.add(next);
        count += 1;
        addmin(arr, next, count,  set);

    }
}
