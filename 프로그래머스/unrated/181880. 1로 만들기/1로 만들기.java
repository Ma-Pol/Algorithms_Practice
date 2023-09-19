class Solution {
    public int solution(int[] nList) {
        int result = 0;
        
        for(int num : nList)
            result += divide(num);
        
        return result;
    }
    
    private int divide(int num) {
        int count = 0;
        
        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num = (num - 1) / 2;
            }
            count++;
        }
        
        return count;
    }
}