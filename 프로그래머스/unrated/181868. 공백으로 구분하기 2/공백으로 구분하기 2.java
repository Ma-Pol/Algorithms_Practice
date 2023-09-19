import java.util.*;

class Solution {
    public String[] solution(String myString) {
        Object[] result = Arrays
                            .stream(myString.trim().split(" "))
                            .filter(str -> !str.equals(""))
                            .toArray();
        
        return Arrays.copyOf(result, result.length, String[].class);
    }
}