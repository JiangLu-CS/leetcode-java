public class fib {
    public int fib(int n){
        if(n <= 1){
            return n;
        }
        int zero = 0;
        int first = 1;
        int result = 0;
        for(int i = 2; i <= n; i++){
            result = zero + first;
            if(result >= 1e9 + 7){
                result -= 1e9 + 7;
            }
            zero = first;
            first = result;
        }

        return result;
    }
}
