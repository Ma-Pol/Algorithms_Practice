class Solution {
    public int solution(int n) {
        // 제곱근이 정수면 자연수의 제곱수
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}