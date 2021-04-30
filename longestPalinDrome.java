public class longestPalinDrome {
    public String longestPalindrome(String s){
        if(s == null || s.length() <= 1){
            return s;
        }
        int max = 0;
        int[][] dp = new int[s.length()][s.length()];
        dp[0][0] = 1;
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
        }
        for(int j = 0; j < s.length(); j++){
            for(int i = 0; i < j; i++){
                if(i == j){
                    continue;
                }
                if(s.charAt(i) == s.charAt(j)){
                    if(dp[i + 1][j - 1] == 1 || i == j - 1){
                        if(max < j - i + 1){
                            max = j - i + 1;
                            start = i;
                            end = j;
                        }
                        dp[i][j] = 1;
                    }

                }

            }
        }
        return s.substring(start, end+1);
    }
}
