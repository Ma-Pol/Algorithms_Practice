class Solution {
    public int solution(String before, String after) {
        
        for(int i = 0; i < before.length(); i++) {
            String temp = before.substring(i, i + 1);
            
            after = after.replaceFirst(temp, "");
        }
        
        return after.length() == 0 ? 1 : 0;
    }
}