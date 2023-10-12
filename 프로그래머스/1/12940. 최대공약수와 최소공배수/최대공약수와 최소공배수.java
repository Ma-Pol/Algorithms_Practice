class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(Math.max(n, m), Math.min(n, m));
        int lcm = (n * m) / gcd;
        
        return new int[] { gcd, lcm };
    }
    
    private int getGCD(int a, int b) {
        if(a % b == 0) return b;
        
        return getGCD(b, a % b);
    }
}