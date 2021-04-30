import java.util.Arrays;

public class findContentChildren {
    public int findConttentChildren(int[] g, int[] s){
        if(g == null || s == null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gg = 0;
        int ss = 0;
        for(; gg < g.length && ss < s.length; ){
            if(g[gg] <= s[ss]){

                gg++;
                ss++;
            }else {
                ss++;
            }
        }
        return gg;
    }
}
