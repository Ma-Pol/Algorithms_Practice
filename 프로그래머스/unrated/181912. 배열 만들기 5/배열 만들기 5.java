import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numList = new ArrayList<>();
        
        for(String intStr : intStrs) {
            int i = 0;
            int num = 0;
            
            for(char ch : intStr.toCharArray()) {
                if(i >= s && i <= l + s - 1) num = num * 10 + Character.getNumericValue(ch);
                i++;
            }
            
            if(num > k) numList.add(num);
        }
        
        int[] result = new int[numList.size()];
        
        for(int j = 0; j < result.length; j++)
            result[j] = numList.get(j);
        
        return result;
    }
}