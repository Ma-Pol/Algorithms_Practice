class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        
        // 제곱근이 정수면 자연수의 제곱수
        return sqrt % 1.0 == 0.0 ? 1 : 2;
    }
}