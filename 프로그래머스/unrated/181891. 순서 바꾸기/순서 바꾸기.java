import java.util.*;

class Solution {
    public int[] solution(int[] nList, int n) {
        int[] start = new int[n];
        start = Arrays.copyOfRange(nList, 0, n);
        
        int[] last = new int[nList.length - n];
        last = Arrays.copyOfRange(nList, n, nList.length);
        
        int[] result = new int[nList.length];
        int idx = 0;
        
        for(int x : last)
            result[idx++] = x;
        
        for(int y : start)
            result[idx++] = y;
        
        return result;
    }
}