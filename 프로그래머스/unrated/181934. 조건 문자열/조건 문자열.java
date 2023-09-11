class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int result = 0;
        boolean ineqCheck = false, eqCheck = false;
        
        if((1 <= n && n <= 100) && (1 <= m && m <= 100)) {
            
            if(ineq.equals(">")) 
                ineqCheck = true;
            
            if(eq.equals("="))
                eqCheck = true;
            
            if(ineqCheck && eqCheck) {
                result = n >= m ? 1 : 0;
            } else if(ineqCheck && !eqCheck) {
                result = n > m ? 1 : 0;
            } else if(!ineqCheck && eqCheck) {
                result = n <= m ? 1 : 0;
            } else {
                result = n < m ? 1 : 0;
            }
            
        }
        
        return result;
    }
}