class Solution {
    public int solution(int balls, int share) {
        long result = 1L;
        int num = 1;
        
        for(int i = share + 1; i <= balls; i++) {
            result *= i;
            result /= num++;
        }
        
        return (int) result;
    }
}