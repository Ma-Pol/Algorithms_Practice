class Solution {
    public int solution(int a, int d, boolean[] inc) {
        int result = 0;
        
        if(1 <= a && a <= 100 && 
           1 <= d && d <= 100 && 
           1 <= inc.length && inc.length <= 100) {
            
            for(int i = 0; i < inc.length; i++)
                if(inc[i])
                    result += a + d * i;
            
        }
        
        return result;
    }
}