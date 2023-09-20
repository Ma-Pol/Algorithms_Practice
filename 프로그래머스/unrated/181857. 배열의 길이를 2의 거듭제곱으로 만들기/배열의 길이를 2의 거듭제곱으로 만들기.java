import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0, j = 1, length = 0;
        
        while(true) {
            if(i <= arr.length && arr.length < j) {
                length = i == arr.length ? i : j;
                break;
            } else {
                i = j;
                j *= 2;
            }
        }
        
        return Arrays.copyOfRange(arr, 0, length);
    }
}