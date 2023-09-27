import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int max = -1, maxIdx = -1;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIdx = i;
            }
        }
        
        return new int[] {max, maxIdx};
    }
}