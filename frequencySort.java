import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class frequencySort {
    public String frequencySort(String s) {
        String result = "";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        ArrayList<Map.Entry<Character,Integer>> e = new ArrayList<>(map.entrySet());
        e.sort((o1,o2) -> o2.getValue() - o1.getValue());
        for(int i = 0; i < e.size() && result.length() < s.length(); i++){
            for(int j = 0; j < e.get(i).getValue(); j++){
                result += e.get(i).getKey();
            }
        }
        return result;

    }
}
