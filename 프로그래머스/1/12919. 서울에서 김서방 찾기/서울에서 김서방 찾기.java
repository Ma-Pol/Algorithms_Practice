class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        
        for(String str : seoul) {
            if(str.equals("Kim")) break;
            
            idx++;
        }
        
        return new StringBuilder("김서방은 ").append(idx).append("에 있다").toString();
    }
}