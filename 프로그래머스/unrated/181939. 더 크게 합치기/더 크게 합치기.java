class Solution {
    public int solution(int a, int b) {
        int result = 0;
        
        if((1 <= a && a <= 10000) && (1 <= b && b <= 10000)) {
            int ab = Integer.parseInt("" + a + b);
            int ba = Integer.parseInt("" + b + a);
            
            result = ab >= ba ? ab : ba;
        }
        
        return result;
    }
}