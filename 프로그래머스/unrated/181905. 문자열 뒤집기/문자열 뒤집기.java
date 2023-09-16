class Solution {
    public String solution(String myString, int s, int e) {
        String result = "";
        StringBuffer sb = new StringBuffer(myString.substring(s, e + 1));
        
        result += myString.substring(0, s);
        result += sb.reverse().toString();
        result += myString.substring(e + 1);
        
        return result;
    }
}