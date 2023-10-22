import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int first = 0, second = 0, third = 0, highest = 0;
        int[] firstArr = { 1, 2, 3, 4, 5 },
              secondArr = { 2, 1, 2, 3, 2, 4, 2, 5 },
              thirdArr = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 },
              result = null;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == firstArr[i % firstArr.length]) first++;
            if(answers[i] == secondArr[i % secondArr.length]) second++;
            if(answers[i] == thirdArr[i % thirdArr.length]) third++;
        }
        
        highest = Math.max(first, Math.max(second, third));
        
        if(highest == first) list.add(1);
        if(highest == second) list.add(2);
        if(highest == third) list.add(3);
        
        result = new int[list.size()];
        
        for(int i = 0; i < result.length; i++)
            result[i] = list.get(i);
        
        return result;
    }
}