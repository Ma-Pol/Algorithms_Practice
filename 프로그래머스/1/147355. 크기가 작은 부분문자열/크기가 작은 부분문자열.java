class Solution {
    public int solution(String t, String p) {
        int result = 0,
            len = p.length();
        long pLong = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - len; i++) {
            long temp = Long.parseLong(t.substring(i, i + len));
            
            if(temp <= pLong) result++;
        }
        
        return result;
    }
}