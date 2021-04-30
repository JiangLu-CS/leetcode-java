public class climbStairs {
    public int climbStair(int n){
        if(n <= 2){
            return n;
        }
        int fir = 1, sec = 2;
        int res = 0;
        for(int i = 2; i < n; i++){
            res = fir + sec;
            fir = sec;
            sec = res;
        }
        return res;
    }
}
