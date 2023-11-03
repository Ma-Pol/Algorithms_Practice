class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        
        for(int i = 0; i < number; i++) {
            int divisor = getDivisorNum(i + 1);
                
            result += divisor > limit ? power : divisor;
        }
        
        return result;
    }
    
    private int getDivisorNum(int n) {
        int count = 0;
        
        for(int i = 1; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                count++;
                
                if(n / i != i)
                    count++;
            }
        }
        
        return count;
    }
}