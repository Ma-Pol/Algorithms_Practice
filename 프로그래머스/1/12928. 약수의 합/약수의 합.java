class Solution {
    public int solution(int n) {
        int result = 0;
        
        // 약수 구하기
        int sqrt = (int) Math.sqrt(n);
        
        for(int i = 1; i <= sqrt; i++)
            // 약수 작은 값
            if(n % i == 0) {
                result += i;
            
                // 약수 큰 값 (n이 제곱수인 경우 제곱근의 중복 제외)
                if(n / i != 1 && n / i != sqrt)
                    result += n / i;
            }
        
        return result;
    }
}