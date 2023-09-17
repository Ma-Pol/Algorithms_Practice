import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = k; i <= n; i = i + k)
            list.add(i);
        
        
        int[] result = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++)
            result[j] = list.get(j);
        
        return result;
    }
}