public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()){
            return false;
        }else if(t.equals(s) ||s.length() == 0){
            return true;
        }
        int sub = 0;
        int par = 0;
        while(par < t.length()){
            if(s.charAt(sub) == t.charAt(par)){
                sub++;
                par++;
            }else{
                par++;
            }
            if(sub == s.length()){
                return true;
            }
        }
        return false;


    }
}
