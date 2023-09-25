class Solution {
    public int solution(int n) {
        int result = 0, sqrt = (int) Math.sqrt(n);
        
        for(int i = 1; i <= sqrt; i++)
            // 순서쌍 작은 수(i) +1
            if(n % i == 0) {
                result++;
                // 순서쌍 큰 수(n / i) +1 (10, 10과 같은 경우가 아닐 때만)
                if(n / i != i) result++;
            }
        
        return result;
    }
}