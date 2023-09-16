class Solution {
    public String solution(int q, int r, String code) {
        String result = "";
        
        for(int i = 0; i < code.length(); i++)
            result += i % q == r ? code.charAt(i) : "";
        
        return result;
    }
}