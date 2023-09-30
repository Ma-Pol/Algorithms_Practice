class Solution {
    public String[] solution(String myStr, int n) {
        int idx = 0, len = myStr.length();
        
        String[] result = new String[len / n + (len % n == 0 ? 0 : 1)];
        
        for(int i = 0; i < len; i += n) {
            int lastIdx = i + n > len ? len : i + n;
            result[idx++] = myStr.substring(i, lastIdx);
        }
        
        return result;
    }
}