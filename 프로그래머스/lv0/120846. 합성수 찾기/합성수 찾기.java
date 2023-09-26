class Solution {
    public int solution(int n) {
        int result = 0;
        
        for(int i = 4; i <= n; i++)
            if(isCompositeNumber(i)) result++;
        
        return result;
    }
    
    private boolean isCompositeNumber(int n) {
        int count = 0;
        
        for(int i = 1; i * i <= n; i++)
            if(i * i == n)
                count++;
            else if(n % i == 0)
                count += 2;
        
        return count >= 3;
    }
}