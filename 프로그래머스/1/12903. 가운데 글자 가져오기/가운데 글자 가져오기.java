class Solution {
    public String solution(String s) {
        int len = s.length();
        
        return len % 2 == 1 ? 
                s.substring(len / 2, len / 2 + 1) : 
                s.substring((len - 1) / 2, (len - 1) / 2 + 2);
    }
}