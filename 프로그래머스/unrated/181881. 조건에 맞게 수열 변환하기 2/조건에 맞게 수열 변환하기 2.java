import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int result = 0;
        
        loop:
        while(true) {
            int[] prev = Arrays.copyOf(arr, arr.length);
            int check = 0;
            
            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] >= 50 && arr[i] % 2 == 0 ? arr[i] / 2 : 
                        arr[i] < 50 && arr[i] % 2 != 0 ? arr[i] * 2 + 1 : 
                        arr[i];
                
                if(prev[i] == arr[i]) check++;
                
                if(i == arr.length - 1 && check == arr.length) break loop;
            }
            
            result++;
        }
        
        return result;
    }
}