class Solution {
    public String solution(String myString, int m, int c) {
        String result = "";
        
        for(int i = c - 1; i < myString.length(); i += m)
            result += myString.substring(i, i + 1);
        
        return result;
    }
}