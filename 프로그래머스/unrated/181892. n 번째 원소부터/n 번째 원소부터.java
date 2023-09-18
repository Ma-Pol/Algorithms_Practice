import java.util.*;

class Solution {
    public int[] solution(int[] nList, int n) {
        return Arrays.copyOfRange(nList, n - 1, nList.length);
    }
}