import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> s1List = Arrays.asList(s1);
        int result = 0;
        
        for(String str : s2) 
            if(s1List.contains(str)) result++;
        
        return result;
    }
}