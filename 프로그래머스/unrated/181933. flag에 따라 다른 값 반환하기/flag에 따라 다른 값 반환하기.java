class Solution {
    public int solution(int a, int b, boolean flag) {
        int result = 0;
        
        if(-1000 <= a && b <= 1000) {
            result = flag ? a + b : a - b;
        }
        
        return result;
    }
}