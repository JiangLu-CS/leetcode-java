import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findContinuousSequence {
    private int count = 0;
    public int[][] findContinuousSequence(int target){
        if(target == 0){
            return new int[0][] ;}
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 1; i <= target / 2 + 2;){
            if(count < target){
                count += i;
                temp.add(i);
                i++;
            }else if(count == target){
                res.add(new ArrayList<>(temp));
                count -= temp.get(0);
                temp.remove(0);
            }else {
                count -= temp.get(0);
                temp.remove(0);
            }
        }
        int[][] result = new int[res.size()][];
        for(int i = 0;i < result.length; i++){

            result[i] = res.get(i).stream().mapToInt(Integer::valueOf).toArray();;
        }
        return result;
    }
}
