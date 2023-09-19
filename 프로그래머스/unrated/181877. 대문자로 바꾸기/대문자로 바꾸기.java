class Solution {
    public String solution(String myString) {
        String result = "";
        
        // 아스키코드 65 ~ 90 : 대문자
        // 아스키코드 97 ~ 122 : 소문자
        for(char ch : myString.toCharArray()) {
            if(97 <= ch && ch <= 122) ch -= 32;
            result += ch;
        }
        
        return result;
    }
}