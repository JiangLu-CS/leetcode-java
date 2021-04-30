import java.util.*;

public class huawei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Set<String>> list= new ArrayList<>();
        while(n-- > 0){
            String[] s = sc.next().split(" ");
            if(list.size() == 0){
                Set<String> set = new HashSet<>();
                set.add(s[0]);
                set.add(s[1]);
                list.add(set);
            }else{
                for (int i = 0; i < list.size(); i++){
                    if(list.get(i).contains(s[0])|| list.get(i).contains(s[1])){
                        list.get(i).add(s[1]);
                        list.get(i).add(s[0]);
                        break;
                    }
                }
            }
        }
        System.out.println(list.size());
    }
}
