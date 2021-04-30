import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        doCombinations(new StringBuilder(), combinations, digits);
        return combinations;


    }
    public void doCombinations(StringBuilder perfix, List<String> combinations, String digits){
        if(perfix.length() == digits.length()){
            combinations.add(perfix.toString());
            return;
        }
        int cur = digits.charAt(perfix.length()) - '0';
        String letters = KEYS[cur];
        for(char c : letters.toCharArray()){
            perfix.append(c);
            doCombinations(perfix, combinations, digits);
            perfix.deleteCharAt(perfix.length() - 1);
        }
    }
}
