class Solution {
    public String solution(String myString) {
        String result = "";
        
        String[] strArr = myString.split("");
        
        for(String str : strArr) {
            char ch = str.charAt(0);
            
            if('a' <= ch && ch <= 'z')
                result += str.toUpperCase();
            else 
                result += str.toLowerCase();
        }
        
        // 이쪽이 좀 더 오래 걸림
        // for(char ch : myString.toCharArray()) {
        //     if('a' <= ch && ch <= 'z')
        //         result += (char) (ch - 32);
        //     else 
        //         result += (char) (ch + 32);
        // }
        
        return result;
    }
}