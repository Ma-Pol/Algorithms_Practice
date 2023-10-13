class Solution {
    
    // 소수 = false, 소수가 아닌 수 = true
    private static boolean[] isPrime = null;
    
    public int solution(int n) {
        int result = 0;
        
        diffPrime(n);
        
        for(boolean check : isPrime)
            if(!check)
                result++;
        
        return result;
    }
    
    private void diffPrime(int n) {
        isPrime = new boolean[n + 1];
        
        // 0과 1은 소수가 아님
        isPrime[0] = isPrime[1] = true;
        
        // 2부터 소수 판별
        for(int i = 2; i <= Math.sqrt(n); i++) {
            
            // 판별하려는 값이 이미 소수가 아닌 것으로 판별된 값인 경우 생략
            if(isPrime[i])
                continue;
            
            // 판별한 값의 모든 배수를 소수가 아닌 것으로 처리
            for(int j = i + i; j < isPrime.length; j += i)
                isPrime[j] = true;
            
        }
    }
}