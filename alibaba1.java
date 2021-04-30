import java.util.Arrays;
import java.util.Scanner;

public class alibaba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        while(count < n){
            arr[count++] = sc.nextInt();
        }
        Arrays.sort(arr);
        int total = arr[arr.length - 1];
        int ming = 0;
        int wo = 0;
        while(true){
            for(int i = 0; i < arr.length; i++){
                ming += arr[i];
                wo += total - arr[i];
            }
            if(wo > ming){
                System.out.println(total);
                break;
            }else {
                total++;
                ming = 0;
                total = 0;
            }
        }


    }
}
