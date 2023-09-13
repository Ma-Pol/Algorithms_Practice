import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = Arrays.copyOf(arr, arr.length);
        
        // 문제: 인덱스가 k의 배수인가?
        if(1 <= arr.length && arr.length <= 1000 &&
          1 <= queries.length && queries.length <= 1000) {
            
            for(int[] query : queries)
                for(int i = query[0]; i <= query[1]; i++)
                    if(i % query[2] == 0)
                        result[i] += 1;
            
        }
        
        return result;
    }
}