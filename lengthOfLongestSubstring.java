import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
       int max = 0;
        Set<Character> set = new HashSet<>();
       for(int l = 0, r = 0; r < s.length(); r++){
           while(set.contains(s.charAt(r))){
               set.remove(s.charAt(l++));
           }
           set.add(s.charAt(r));
           max = Math.max(max, r - l + 1);
       }
       return max;
    }
}
