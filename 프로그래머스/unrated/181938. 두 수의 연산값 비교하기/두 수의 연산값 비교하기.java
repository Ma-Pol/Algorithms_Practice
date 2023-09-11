class Solution {
    public int solution(int a, int b) {
        int result = 0;
        
        if((1 <= a && a <= 10000) && (1 <= b && b <= 10000)) {
            int ab = Integer.parseInt("" + a + b);
            int _2ab = 2 * a * b;
            
            result = ab >= _2ab ? ab : _2ab;
            // result = Math.max(ab, _2ab); // 이것도 가능
        }
        
        return result;
    }
}