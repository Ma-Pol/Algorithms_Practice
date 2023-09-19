class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        
        for(int x : numbers) {
            result += x;
            if(result > n) break;
        }
        
        return result;
    }
}