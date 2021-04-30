public class cuttingRope {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int[] max = new int[n];
        max[0] = 1;
        max[1] = 2;
        max[2] = 3;
        int result = 0;
        int maxv = 0;
        for (int i = 4; i < n; i++) {
            for(int j = 1; j <= i / 2; j++){
                maxv = Math.max(maxv, max[i - j] * max[j]);
            }
            max[i] = maxv;
        }
        return max[n];
    }
}

//6

//1 5  1x m5->
//2 4  // 1
// 3 3