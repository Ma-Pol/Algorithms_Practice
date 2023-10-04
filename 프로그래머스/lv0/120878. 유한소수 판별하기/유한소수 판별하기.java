class Solution {
    public int solution(int a, int b) {
        int result = 0, 
            gcd = getGCD(a, b);
        
        b /= gcd;
        
        while(true) {
            if(b % 2 == 0) {
                b /= 2;
                continue;
            }
            
            if(b % 5 == 0) {
                b /= 5;
                continue;
            }
            
            result = b == 1 ? 1 : 2;
            break;
        }
        
        return result;
    }
    
    // 유클리드 호제법을 이용해 최대 공약수 찾기
    // 자연수 a, b에 대해 a를 b로 나눈 나머지를 r이라 한다.
    // a, b의 최대 공약수는 b, r의 최대 공약수와 같다.
    // b, r의 최대 공약수는 r, r' (b % r)의 최대 공약수와 같다.
    // 나머지가 0이 될 때, '나눈 수'가 a, b의 최대 공약수가 된다.
    private int getGCD(int a, int b) {
        if(a % b == 0) return b;
        
        return getGCD(b, a % b);
    }
}