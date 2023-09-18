import java.util.*;

class Solution {
    public String[] solution(String[] sList) {
        String[] result = null;
        int idx = 0;
        
        loop:
        for(String str : sList) {
            switch(str) {
                case "l":
                    result = new String[idx];
                    result = Arrays.copyOfRange(sList, 0, idx);
                    break loop;
                case "r":
                    result = new String[sList.length - idx - 1];
                    result = Arrays.copyOfRange(sList, idx + 1, sList.length);
                    break loop;
                default:
                    idx++;
                    break;
            }
        }
        
        if(result == null)
            result = new String[0];
        
        return result;
    }
}