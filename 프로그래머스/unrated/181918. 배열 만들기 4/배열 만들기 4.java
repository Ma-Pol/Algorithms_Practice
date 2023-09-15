import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        
        if(1 <= arr.length && arr.length <= 100000) {
            for(int i = 0; i < arr.length; i++) {
                if(stkList.size() == 0 || stkList.get(stkList.size() - 1) < arr[i])
                    stkList.add(arr[i]);
                else {
                    stkList.remove(stkList.size() - 1);
                    i--;
                }
            }
        }
        
        int[] stk = new int[stkList.size()];
        int cnt = 0;
        
        for(int x = 0; x < stkList.size(); x++)
            stk[x] = stkList.get(x);
        
        return stk;
    }
}