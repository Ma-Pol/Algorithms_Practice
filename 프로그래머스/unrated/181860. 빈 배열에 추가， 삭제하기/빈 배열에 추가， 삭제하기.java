import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(flag[i])
                for(int j = 0; j < arr[i] * 2; j++)
                    x.add(arr[i]);
            else
                x = x.subList(0, x.size() - arr[i]);
        }
        
        
        
        return x.stream().mapToInt(Integer::intValue).toArray();
    }
}