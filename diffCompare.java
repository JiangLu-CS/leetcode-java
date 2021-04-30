import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class diffCompare {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String last = scanner.next();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i < first.length(); i++){
            StringBuilder s0 = new StringBuilder();
            while(i < first.length() && first.charAt(i) != '-'){
                s0.append(first.charAt(i));
                i++;
            }
            StringBuilder s = new StringBuilder();
            while(i < first.length() && first.charAt(i) != ','){
                s.append(first.charAt(i));
                i++;
            }
            list.add(s0.toString());
            map1.put(s0.toString(), s.toString());
        }
        for(int i = 0; i < last.length(); i++){
            StringBuilder s0 = new StringBuilder();
            while(i < last.length() && last.charAt(i) != '-'){
                s0.append(last.charAt(i));
                i++;
            }
            StringBuilder s = new StringBuilder();
            while(i < last.length() && last.charAt(i) != ','){
                s.append(last.charAt(i));
                i++;
            }
            list2.add(s0.toString());
            map2.put(s0.toString(), s.toString());
        }
        for(int i = 0;i < map1.size(); i++){
            if(map2.containsKey(list.get(i))){
                if(!map2.get(list.get(i)).equals(map1.get(list.get(i)))){
                    res.add("modify-" + list.get(i));
                }
            }else{
                res.add("delete-" + list.get(i));
            }
        }
        for(int i = 0; i < map2.size(); i++){
            if(!map1.containsKey(list2.get(i))){
                res.add("add-" + list2.get(i));
            }
        }
        res.sort(String::compareTo);
        for(int i = 0; i < res.size() - 1;i++){
            System.out.print(res.get(i) + ",");
        }
        System.out.print(res.get(res.size() - 1));
    }
}
