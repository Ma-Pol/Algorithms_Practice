import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>(); // 자동 정렬되는 TreeMap 사용
        int[] res = new int[3];
        int cnt = 0;
        
        for(int i = 0; i < rank.length; i++)
            if(attendance[i]) map.put(rank[i], i);
        
        for (Integer key : map.keySet())
            if(cnt < 3) res[cnt++] = map.get(key);
        
        return 10000 * res[0] + 100 * res[1] + res[2];
    }
}