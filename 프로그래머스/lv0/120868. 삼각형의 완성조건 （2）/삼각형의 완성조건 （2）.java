class Solution {
    public int solution(int[] sides) {
        int result = 0;
        int max = Math.max(sides[0], sides[1]), min = Math.min(sides[0], sides[1]);
        
        // max가 가장 긴 변의 길이일 경우
        // max는 min + i 보다 작아야 하며, i는 max 이하여야 한다.
        for(int i = max - min + 1; i <= max; i++)
                result++;
        
        // j가 가장 긴 변의 길이일 경우
        // j는 min + max 보다 작아야 한다.
        for(int j = max + 1; j < min + max; j++) {
            result++;
        }
        
        return result;
        
//         int min = Math.min(sides[0], sides[1]);
        
//         // 1. 주어진 두 변의 길이 중 하나가 가장 긴 변
//         // ==> max < min + x
//         // ==> max - min < x
        
//         // 2. x가 가장 긴 변인 경우
//         // ==> max + min > x
//         // ==> x < max + min
        
//         // max - min < x < max + min
        
//         return min * 2 - 1;
    }
}