class Solution {
    public int solution(int num, int n, int m) {
        int result = 0;
        
        if((10 <= num && num <= 100) && 
           (2 <= n && n <= 10) && 
           (2 <= m && m <= 10)) {
            result = num % n == 0 && num % m == 0 ? 1 : 0;
        }
        
        return result;
    }
}