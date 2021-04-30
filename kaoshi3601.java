import java.util.Scanner;

public class kaoshi3601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        while(count < n){
            arr[count++] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                res += arr[i] | arr[j];
            }
        }
        System.out.println(res);
    }
}
