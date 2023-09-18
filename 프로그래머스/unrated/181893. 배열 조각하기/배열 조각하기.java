import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] result = null;
        
        for(int i = 0; i < query.length; i++) {
            int idx = query[i];
            
            if(i % 2 == 0) {
                result = new int[arr.length - idx - 1];
                result = Arrays.copyOfRange(arr, 0, idx + 1);
            } else {
                result = new int[arr.length - idx];
                result = Arrays.copyOfRange(arr, idx, arr.length);
            }
            
            arr = result.clone();
        }
        
        return result;
    }
}