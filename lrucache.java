import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class lrucache {
    private int capacity;
    private Map<Integer, Integer> map = new LinkedHashMap<>();
    public lrucache(int capacity) {
        this.capacity = capacity;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
        }else if(map.size() == capacity){
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            it.next();
            it.remove();
        }
        map.put(key, value);
    }
}
