import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] result = myStr.split("a|b|c");
        result = Arrays.stream(result).filter(str -> !str.isEmpty()).toArray(String[]::new);
        
        return result.length == 0 ? new String[] {"EMPTY"} : result;
    }
}