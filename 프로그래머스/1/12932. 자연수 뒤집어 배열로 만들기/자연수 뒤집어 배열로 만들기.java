import java.util.*;

class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] result = new int[num.length()];
        int idx = 0;
        
        for(int i = num.length() - 1; i >= 0; i--)
            result[idx++] = Character.getNumericValue(num.charAt(i));
        
        return result;
    }
}