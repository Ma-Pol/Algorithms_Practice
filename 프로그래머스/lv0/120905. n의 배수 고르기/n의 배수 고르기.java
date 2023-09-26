import java.util.*;

class Solution {
    public int[] solution(int n, int[] nList) {
        List<Integer> list = new ArrayList<>();
        
        for(int x : nList)
            if(x % n == 0) list.add(x);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}