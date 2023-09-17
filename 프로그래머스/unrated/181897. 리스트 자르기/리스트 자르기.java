import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] result = null;
        
        switch(n) {
            case 1:
                result = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                break;
            case 2:
                result = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                result = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4:
                result = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                int idx = 0;
                
                for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    result[idx++] = num_list[i];
                }
                
                break;
        }
        
        
        return result;
    }
}