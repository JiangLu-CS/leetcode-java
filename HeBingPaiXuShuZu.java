public class HeBingPaiXuShuZu {
    public void merge(int[] A, int m, int[] B, int n) {
        int a = A.length - 1;
        while(a >=0 && n >= 0&& m >= 0){
            if(A[a] >= B[n] ){
                A[a--] = A[m--];
            }else{
                A[a--] = B[n--];
            }
        }
        if(m > 0){
            return;
        }
        while(n > 0){
            A[a--] = B[n--];
        }

    }
}
