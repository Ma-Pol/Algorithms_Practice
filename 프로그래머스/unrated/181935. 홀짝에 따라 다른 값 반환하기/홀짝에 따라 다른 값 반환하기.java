class Solution {
    public int solution(int n) {
        int result = 0;
        
        if(1 <= n && n <= 100) {
            // 짝수
            if(n % 2 == 0) {
                for(int j = 2; j <= n; j = j + 2) {
                    result += (j * j);
                }
            }
            
            // 홀수
            else {
                for(int i = 1; i <= n; i = i + 2) {
                    result += i;
                }
            }
        }
        
        return result;
    }
}