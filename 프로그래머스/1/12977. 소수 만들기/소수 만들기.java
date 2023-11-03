class Solution {
    public int solution(int[] nums) {
        int result = 0;
        
        for(int i = 0; i < nums.length - 2; i++)
            for(int j = i + 1; j < nums.length - 1; j++)
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if(checkPrimeNumber(sum)) result++;
                }
        
        return result;
    }
    
    private boolean checkPrimeNumber(int n) {
        boolean isPrime = true;
        
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        
        return isPrime;
    }
}