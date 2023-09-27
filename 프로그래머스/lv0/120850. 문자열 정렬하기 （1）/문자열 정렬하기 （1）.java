import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.replaceAll("[^0-9]", "").split("");
        int[] result = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++)
            result[i] = Integer.parseInt(strArr[i]);
        
        Arrays.sort(result);
        
        return result;
    }
}