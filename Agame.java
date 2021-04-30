import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Agame {
    @Test
    public static void main(String[] args) {
        //5 4
        //0 0 0 0 0
        //0

        //5 4
        // 3 2 1 1 1
        //5

        //5 2
        // 1 2 3 4 5
        //2
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int count = 0;
        int[] score = new int[n];
        while(count < n){
            score[count++] = scanner.nextInt();
        }
        Arrays.sort(score);
        int res = 0;

        int flag = score[score.length - x];

        for(int i = 0; i < score.length; i++){
            if(score[i] == 0){
                continue;
            }
            if(score[i] >= flag){
                res++;
            }
        }
        System.out.println(res);
    }
}
