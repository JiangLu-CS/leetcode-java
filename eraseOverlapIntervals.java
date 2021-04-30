import java.util.Arrays;
import java.util.Comparator;

public class eraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null){
            return 0;
        }
        int count = 0;


        int one = 0;
        int two = 1;
        if(intervals.length <=1){
            return 0;
        }
            Arrays.sort(intervals, Comparator.comparingInt(o->o[1]));
            for(; one < intervals.length && two < intervals.length;){
                if(intervals[one][1] < intervals[two][0]){
                    count++;
                    one++;
                    two++;
                }else{
                    two++;
                }
        }
        return intervals.length - count;

    }
}
