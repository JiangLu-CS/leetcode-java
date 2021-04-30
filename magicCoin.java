import java.util.Scanner;

public class magicCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        put(n, result);
        result.reverse();
        System.out.println(result);
    }
    public static void put(long cur, StringBuilder result){
        if(cur == 0){
            return;
        }
        if(cur % 2 == 0){
            cur = (cur - 2) / 2;
            result.append('2');
            put(cur, result);
        }
        else if(cur % 2 == 1){
            cur = (cur - 1) / 2;
            result.append('1');
            put(cur, result);
        }

    }
}
