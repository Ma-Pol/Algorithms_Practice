import java.util.*;

class Solution {
    public int[] solution(int[] nList) {
        Arrays.sort(nList);
        return Arrays.copyOfRange(nList, 5, nList.length);
    }
}