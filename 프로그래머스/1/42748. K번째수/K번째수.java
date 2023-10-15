import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int idx = 0;
        
        for(int[] command : commands) {
            int[] tempArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            
            Arrays.sort(tempArr);
            
            result[idx++] = tempArr[command[2] - 1];
        }
        
        return result;
    }
}