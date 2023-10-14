class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray())
            if(ch == ' ') {
                sb.append(" ");
                continue;
            }
            
            else if('A' <= ch && ch <= 'Z')
                sb.append((char) ((ch - 65 + n) % 26 + 65));
            
            else if('a' <= ch && ch <= 'z')
                sb.append((char) ((ch - 97 + n) % 26 + 97));
        
        return sb.toString();
    }
}