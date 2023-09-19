import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        // return Arrays
        //         .stream(myString.trim().split(" "))
        //         .filter(str -> !str.equals(""))
        //         .toArray(String[]::new);
        
        return myString.trim().split("[ ]+");
    }
}