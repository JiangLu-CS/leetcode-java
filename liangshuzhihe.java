import java.util.HashMap;
import java.util.Map;

public class liangshuzhihe {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            map.put(target - numbers[i], i);
        }
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(numbers[i])){
                res[0] = i;
                res[1] = map.get(i);
            }
        }
        return res;
    }
}
