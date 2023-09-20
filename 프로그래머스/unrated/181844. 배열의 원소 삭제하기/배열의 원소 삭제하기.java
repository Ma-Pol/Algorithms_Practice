import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] dArr) {
        List<Integer> result = new ArrayList<>();
        
        loop:
        for(int x : arr) {
            for(int y : dArr)
                if(x == y) continue loop;
            
            result.add(x);
        }
        
        return listToArray(result);
    }
    
    private int[] listToArray(List<Integer> list) {
        int[] newArr = new int[list.size()];
        int idx = 0;
        
        for(int x : list)
            newArr[idx++] = x;
        
        return newArr;
    }
}