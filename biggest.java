import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.nextByte();
        int b = s.nextInt();
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        //12 8
        //8 12 % 8 = 4
        //4 8 % 4 = 0
        while(a != 0){
            int temp = b;
            b = a;
            a = temp % a;
        }
        System.out.println(b);
    }
}
