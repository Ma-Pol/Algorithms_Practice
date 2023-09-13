import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] result = { n };
        return collatz(result, 0);
    }
    
    public int[] collatz(int[] arr, int i) {
        if(arr[i] == 1) return arr;
        
        int[] new_arr = Arrays.copyOf(arr, arr.length + 1);
        
        new_arr[i + 1] = arr[i] % 2 == 0 ? arr[i] / 2 : 3 * arr[i] + 1;
        i++;
        
        return collatz(new_arr, i);
    }
}