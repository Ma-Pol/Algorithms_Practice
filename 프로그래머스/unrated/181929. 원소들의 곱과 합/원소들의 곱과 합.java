class Solution {
    public int solution(int[] nli) {
        int result = 0;
        
        if(2 <= nli.length && nli.length <= 10) {
            int sum = 0, mul = 1;
            
            for(Integer x : nli) {
                if(1 > x || x > 9) return 0;
                
                sum += x;
                mul *= x;
            }
            
            result = mul < sum * sum ? 1 : 0;
        }
        
        return result;
    }
}