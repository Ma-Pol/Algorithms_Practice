class Solution {
    public int[] solution(String myString) {
        int[] result = new int[52];
        
        if(1 <= myString.length() && myString.length() <= 1000) {
            for(char ch : myString.toCharArray()) {
                int i = ch;
                
                // 아스키코드 65 ~ 90 : 대문자
                // 아스키코드 97 ~ 122 : 소문자
                if(65 <= i && i <= 90)
                    result[i - 65]++;
                else
                    result[i - 97 + 26]++;
            }
        }
        
        return result;
    }
}