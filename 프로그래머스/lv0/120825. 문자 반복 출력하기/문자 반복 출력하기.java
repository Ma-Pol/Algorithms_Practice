class Solution {
    public String solution(String myString, int n) {
        String result = "";
        
        for(char ch : myString.toCharArray()) {
            String str = "" + ch;
            result += str.repeat(n);
        }
        
        return result;
    }
}