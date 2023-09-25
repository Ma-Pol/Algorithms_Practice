class Solution {
    public int solution(int[] array, int n) {
        int result = 0;
        
        for(int x : array)
            if(x == n) result++;
        
        return result;
    }
}