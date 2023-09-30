class Solution {
    public int solution(int[] array) {
        int result = 0;
        
        for(int num : array) {
            while(num != 0) {
                result += num % 10 == 7 ? 1 : 0;
                num /= 10;
            }
        }
        
        return result;
    }
}