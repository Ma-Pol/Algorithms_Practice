class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String first = "", last = "";
        int osLength = overwrite_string.length(), msLength = my_string.length();
        
        if(1 <= osLength && osLength <= msLength && msLength <= 1000 && 
           0 <= s && s <= msLength - osLength) {
            first += my_string.substring(0, s);
            last += my_string.substring(s + osLength, msLength);
        }
        
        return first + overwrite_string + last;
    }
}