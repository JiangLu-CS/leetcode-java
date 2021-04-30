import java.util.ArrayList;
import java.util.List;

public class lastRemaining {
    public int lastRemaining(int n, int m){
        if (n <= 1){
            return n;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1){
            index = (index + m - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}
