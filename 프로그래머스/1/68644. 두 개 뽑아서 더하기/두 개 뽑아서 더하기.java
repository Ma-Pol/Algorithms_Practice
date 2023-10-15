import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        int[] result = null;
        int idx = 0;
        
        for(int i = 0; i < numbers.length - 1; i++)
            for(int j = i + 1; j < numbers.length; j++)
                set.add(numbers[i] + numbers[j]);
        
        Iterator iter = set.iterator();
        result = new int[set.size()];
        
        while(iter.hasNext())
            result[idx++] = Integer.parseInt(iter.next().toString());
        
        return result;
    }
}