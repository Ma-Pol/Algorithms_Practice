class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        
        for (int x : numbers) {
            result += x;
        }
        
        return result /= numbers.length;
    }
}