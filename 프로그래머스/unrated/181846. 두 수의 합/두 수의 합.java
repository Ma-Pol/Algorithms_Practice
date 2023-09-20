import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger aBI = new BigInteger(a), bBI = new BigInteger(b);
        
        return aBI.add(bBI).toString();
    }
}