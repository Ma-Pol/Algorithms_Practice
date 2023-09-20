import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>(30);
        
        for(String str : strArr) {
            int temp = str.length();
            
            if(map.containsKey(temp))
                map.put(temp, map.get(temp) + 1);
            else
                map.put(temp, 1);
        }
        
        return Collections.max(map.values());
    }
}