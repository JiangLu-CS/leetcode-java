public class hehehehe {


    public  String Solution(String s) {
        StringBuilder result = new StringBuilder();
        if (s == null || s.length() <= 2) {
            result.append(s);
            return result.toString();
        }
        result.append(s, 0, 2);

        for(int i = 3; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)){
                continue;
            }else if(s.charAt(i - 2) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)){
                continue;
            }
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
