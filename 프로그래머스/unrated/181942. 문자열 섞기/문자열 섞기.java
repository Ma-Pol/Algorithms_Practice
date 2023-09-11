class Solution {
    public String solution(String str1, String str2) {
        String result = "";
        
        if(1 <= str1.length() && str1.length() == str2.length() && str2.length() <= 10) {
            for(int i = 0; i < str1.length(); i++) {
                result += str1.substring(i, i + 1) + str2.substring(i, i + 1);
            }
        }
        
        return result;
    }
}