class Solution {
    public int solution(int[] array, int height) {
        int result = 0;
        
        for(int x : array)
            if(x > height) result++;
        
        return result;
    }
}