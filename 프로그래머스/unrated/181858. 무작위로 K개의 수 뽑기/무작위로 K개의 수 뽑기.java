import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[k];
        
        for(int x : arr)
            if(!list.contains(x)) list.add(x);
        
        for(int i = 0; i < result.length; i++)
            result[i] = list.size() > i ? list.get(i) : -1;
        
        return result;
    }
}