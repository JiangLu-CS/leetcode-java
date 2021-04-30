import java.util.List;

class findLongestWord {
    public String findLongestWord(String s, List<String> d) {
        String longestword = "";
        for(String target : d){
            int i = 0;
            int j = 0;
            int m = target.length();
            int n = longestword.length();
            if(m < n ||
                    m == n && longestword.compareTo(target) < 0){
                continue;
            }
            while(i < s.length() && j < target.length()){

                if(s.charAt(i) == target.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
                if(j == target.length()){

                        longestword = target;

                }
            }
        }
        return longestword;
    }
}