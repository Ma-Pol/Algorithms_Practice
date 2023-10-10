import java.util.*;

class Solution {
    public long solution(long n) {
        String[] numArr = Long.toString(n).split("");
        
        Arrays.sort(numArr, Collections.reverseOrder());
        
        return Long.parseLong(String.join("", numArr));
    }
}