import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> strList = new ArrayList<>();
        
        for(int i = 0; i < myString.length(); i++)
            strList.add(myString.substring(i));
        
        Collections.sort(strList);
        
        return strList.toArray(new String[strList.size()]);
    }
}