class Solution {
    public long solution(int a, int b) {
        // 등차수열의 합공식
        // 항의 개수 : n = Math.abs(a - b) + 1
        // 첫 항 : x = a or b
        // 끝 항 : y = a or b
        // ==> n * (x + y) / 2
        return (Math.abs(a - b) + 1l) * (a + b) / 2l;
    }
}