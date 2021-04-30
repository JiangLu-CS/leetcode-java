import java.util.*;

public class fitstUniqChar {
    public char firstUniqChar(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Character m : map.keySet()){
            if (map.get(m) == 1){
                return m;
            }
        }
        return ' ';
    }
}
