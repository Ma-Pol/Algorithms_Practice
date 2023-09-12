class Solution {
    public int solution(int a, int b, int c) {
        int result = 0;
        
        if(1 <= a && a <= 6 &&
          1 <= b && b <= 6 &&
          1 <= c && c <= 6) {
            
            result = a + b + c;
            
            result *= (a == b || b == c || a == c) ? (a * a + b * b + c * c) : 1;
            
            result *= (a == b && b == c) ? (a * a * a + b * b * b + c * c * c) : 1;
        }
        
        return result;
    }
}