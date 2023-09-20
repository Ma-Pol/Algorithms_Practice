class Solution {
    public int solution(String myString, String pat) {
        int result = 0, start = 0;
        
        while(start < myString.length()) {
            String temp = myString.substring(start, myString.length());
            
            if(temp.contains(pat)) {
                start = myString.indexOf(pat, start) + 1;
                result++;
            } else {
                break;
            }
        }
        
        return result;
    }
}