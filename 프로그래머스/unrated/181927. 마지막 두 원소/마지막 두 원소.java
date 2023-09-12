import java.util.*;

class Solution {
    public int[] solution(int[] nli) {
        int[] result = Arrays.copyOf(nli, nli.length + 1);
        
        if(2 <= nli.length && nli.length <= 10) {
            
            int nliLast = nli.length - 1;
            int nliPreLast = nli.length - 2;
            int resLast = result.length - 1;
            
            result[resLast] = nli[nliLast] > nli[nliPreLast] ? 
                (nli[nliLast] - nli[nliPreLast]) : (nli[nliLast] * 2);
            
        }
        
        return result;
    }
}