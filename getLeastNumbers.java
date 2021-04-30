import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k){
        if(arr == null || arr.length == 0 || k <= 0 || k > arr.length){
            return new int[0];
        }
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for(int i = 0; i < arr.length; i++){
            if(i >= k){
                if(pq.peek() > arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }else{
                pq.add(arr[i]);
            }

        }
        return Arrays.stream(pq.toArray(new Integer[0])).mapToInt(Integer::valueOf).toArray();
    }
}
