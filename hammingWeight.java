public class hammingWeight {
    public int hammingWeight(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
