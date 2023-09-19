import java.util.*;

class Solution {
    public String[] solution(String[] tList, boolean[] finished) {
        List<String> resList = new ArrayList<>();
        
        for(int i = 0; i < tList.length; i++)
            if(!finished[i]) resList.add(tList[i]);
        
        String[] result = resList.toArray(new String[0]);
        
        return result;
    }
}