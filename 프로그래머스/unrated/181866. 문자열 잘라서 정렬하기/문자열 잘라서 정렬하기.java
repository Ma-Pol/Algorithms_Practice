import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] result = myString.split("x");
        Arrays.sort(result);
        
        int check = 0;
        
        for(String str : result)
            check += str.equals("") ? 1 : 0;
        
        return Arrays.copyOfRange(result, check, result.length);
    }
}