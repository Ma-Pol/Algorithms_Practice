class Solution {
    public int solution(int n) {
        int result = 0;
        
        while(true) {
            int i = factorial(result);
            
            if(i > n) {
                result--;
                break;
            } else {
                result++;
            }
        }
        
        return result;
    }
    
    private int factorial(int x) {
        
        if(x <= 1) return x;
        
        return factorial(x - 1) * x;
    }
}