class Solution {
    public int solution(int[] nli) {
        int result = 0;
        
        if(2 <= nli.length && nli.length <= 10) {
            int odd = 0, even = 0;
            
            for(Integer x : nli) {
                if(1 > x || x > 9) return 0;
                
                even = x % 2 == 0 ? (even * 10 + x) : even;
                odd = x % 2 != 0 ? (odd * 10 + x) : odd;
            }
            
            result = even + odd;
        }
        
        return result;
    }
}