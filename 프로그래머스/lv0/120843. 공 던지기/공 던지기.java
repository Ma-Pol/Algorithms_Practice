class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0, length = numbers.length;
        
        while(--k > 0)
            idx = (idx + 2) % length;
        
        return numbers[idx];
    }
}