import java.util.Scanner;

public class fight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        while(count < n){
            arr[count++] = scanner.nextInt();
        }

        int e = arr[arr.length - 1] % 2 == 0 ?
                arr[arr.length - 1] / 2 : arr[arr.length - 1] / 2 + 1;
        for(int i = arr.length - 2; i >=0; i--){
            if(e < arr[i]){
                e = (e + arr[i]) % 2 == 0 ? (e + arr[i]) / 2 : (e + arr[i]) / 2 + 1;

            }else
            if(e > arr[i]){
                e = (e + arr[i]) % 2 == 0 ? (e + arr[i]) / 2 : (e + arr[i]) / 2 + 1;
            }
        }
        System.out.println(e);
    }
}
