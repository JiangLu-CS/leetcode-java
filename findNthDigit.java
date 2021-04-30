public class findNthDigit {
    public int findNthDigit(int n){
        if(n <= 9){
            return n;
        }
        int flag = 2;
        while(9 * flag * Math.pow(10,flag - 1) < n){
            flag++;
        }
        n -= 9 * (flag - 1) * Math.pow(10,flag - 2);
        long num = (long) (Math.pow(10,flag - 1) + n / flag - 1);

        int sq = n % flag;
        if(sq == 0){
            return (int) (num % 10);
        }else{
            for(int i = 0; i < flag - n % flag; i++){
                num /= 10;
            }
            return (int) (num % 10);
        }
    }
}
