import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        int max = Math.max(row, col);
        
        int[][] result = new int[max][max];
        
        for(int i = 0; i < arr.length; i++)
            result[i] = Arrays.copyOf(arr[i], max);
        
        return result;
    }
}