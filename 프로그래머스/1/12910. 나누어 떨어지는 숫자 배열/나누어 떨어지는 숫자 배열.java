import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        
        for(int num : arr)
            if(num % divisor == 0) result.add(num);
        
        Collections.sort(result);
        
        return result.size() == 0 ? new int[] { -1 } : 
                                    result.stream().mapToInt(Integer::intValue).toArray();
    }
}