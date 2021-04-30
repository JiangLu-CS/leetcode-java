import javax.naming.LinkLoopException;
import java.util.*;


public class ladderLength {
    public boolean comp(String a, String b){
        int count = 0;
        for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    count++;
                }
                if(count > 1){
                    return false;
                }
        }
        return true;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList){

        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        set.add(beginWord);
        int ans = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            ans++;


            while(size-- > 0){
                String cur = queue.remove();
                for(int i = 0; i < wordList.size(); i++){
                    if(!set.contains(wordList.get(i))){
                        if(comp(cur, wordList.get(i)))
                       {
                           if(wordList.get(i).equals(endWord)){
                               return ans;
                           }
                            set.add(wordList.get(i));
                            queue.add(wordList.get(i));
                        }
                    }
                }
            }

        }
        return 0;
    }
}
