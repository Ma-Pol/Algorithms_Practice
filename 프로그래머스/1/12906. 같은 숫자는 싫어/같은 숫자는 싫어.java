import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr)
            if(list.size() == 0 || list.get(list.size() - 1) != num)
                list.add(num);
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        
        return result;
    }
}