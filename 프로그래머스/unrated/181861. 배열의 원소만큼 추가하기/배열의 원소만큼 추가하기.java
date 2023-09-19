import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> nList = new ArrayList<>();
        
        for(int a : arr)
            for(int i = 0; i < a; i++)
                nList.add(a);
        
        
        int[] result = new int[nList.size()];
        int idx = 0;
        
        for(int x : nList)
            result[idx++] = x;
        
        return result;
        
        // return nList.stream().mapToInt(x -> x).toArray();
    }
}