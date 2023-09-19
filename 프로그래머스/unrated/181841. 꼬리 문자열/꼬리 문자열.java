class Solution {
    public String solution(String[] sList, String ex) {
        String result = "";
        
        for(String str : sList)
            result = str.contains(ex) ? result : result + str;
        
        return result;
    }
}