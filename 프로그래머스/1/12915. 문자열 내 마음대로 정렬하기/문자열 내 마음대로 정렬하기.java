import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] result = new String[strings.length];
        
        List<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        
        for(String str : strings) {
            temp.append(str.substring(n, n + 1) + str);
            
            list.add(temp.toString());
            
            temp.delete(0, temp.length());
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i).substring(1, list.get(i).length());
        
        return result;
    }
}