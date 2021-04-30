import java.util.Scanner;

public class charge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int charge = 1024 - n;
        int n64 = charge / 64;
        int n16 = (charge % 64) / 16;
        int n4 = (charge % 16) / 4;
        int n1 = (charge % 4);
        int res = n64 + n16 + n4 + n1;
        System.out.println(res);
    }
}
