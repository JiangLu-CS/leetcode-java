import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cat {

    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        Map<String, Integer> map1 =  new HashMap<>();
        int max = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-- > 0){
            int m = scanner.nextInt();
            while(m-- > 0){
                int per = scanner.nextInt();
                while(per-- > 0){
                    String s = "";
                    s += scanner.nextInt();
                    s += scanner.nextInt();
                    if(map.containsKey(s)){
                        int temp = map.get(s) + 1;
                        map1.put(s, temp);
                        if(temp > max){
                            max = temp;
                        }
                    }else{
                        map1.put(s, 1);
                    }
                }
                map.clear();
                map.putAll(map1);
                map1.clear();
            }
            System.out.println(max);
        }
    }
}
