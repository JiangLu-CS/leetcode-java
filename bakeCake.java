import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bakeCake {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int count = 0;
            int[] cake = new int[m];
            int max = 0;
            int min = 0;
            if(a < b){
                max = b;
                min = a;
            }else{
                max = a;
                min = b;
            }
            while(count < m){
                cake[count++] = scanner.nextInt();
            }
            Arrays.sort(cake);
            if(max < cake[0]){
                System.out.println("No");
            }
            else if(min > cake[cake.length - 1]){
                System.out.println("No");
            }
            else if(max == cake[cake.length - 1] && min == cake[0]){
                System.out.println("Yes");
            }
            else if(max == cake[cake.length - 1] || min == cake[0]){
                if(n == m){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
            else if((n - m) < 2){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }

    }
}
