import java.util.*;

class Solution {
    public String solution(String myString) {
        List<String> list = Arrays.asList(myString.toLowerCase().split(""));
        
        Collections.sort(list);
        
        return String.join("", list);
    }
}