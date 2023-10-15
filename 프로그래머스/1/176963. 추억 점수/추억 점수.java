import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<String> nameList = new ArrayList<>(Arrays.asList(name));
        
        int[] result = new int[photo.length];
        int idx = 0;
        
        for(String[] temp : photo) {
            int score = 0;
            
            for(int i = 0; i < temp.length; i++) {
                int index = nameList.indexOf(temp[i]);
                
                score += index != -1 ? yearning[index] : 0;
            }
            
            result[idx++] = score;
        }
        
        return result;
    }
}