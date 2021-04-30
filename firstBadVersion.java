
public class firstBadVersion {
    public int firstBadVersion(int n){
        int l = 1;
        int r = n;
        int mid;
        while(l < r){
           /* if( !(isBadVersion(mid) && isBadVersion(mid + 1))){
                return mid + 1;
            }
            int mid = l + (r - l) / 2;
            if(isBadVersion(mid)){
                r = mid - 1;
            }else{
                l = mid + 1;
            }*/
        }
        return l;
    }
}
