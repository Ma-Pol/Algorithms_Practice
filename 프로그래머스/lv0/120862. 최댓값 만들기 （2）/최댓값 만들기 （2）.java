import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int start = numbers[0] * numbers[1], 
            last = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return start > last ? start : last;
    }
}