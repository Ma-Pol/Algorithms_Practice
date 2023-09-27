class Solution {
    public String solution(String myString) {
        String result = "";
        
        while(myString.length() > 0) {
            String str = myString.substring(0, 1);
            
            result += str;
            
            myString = myString.replaceAll(str, "");
        }
        
        return result;
    }
}