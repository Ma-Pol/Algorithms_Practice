import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int select = nums.length / 2;
        Set<Integer> phoneketmon = new HashSet<>();
        
        for(int num : nums)
            phoneketmon.add(num);
        
        int distinct = phoneketmon.size();
        
        return distinct >= select ? select : distinct;
    }
}