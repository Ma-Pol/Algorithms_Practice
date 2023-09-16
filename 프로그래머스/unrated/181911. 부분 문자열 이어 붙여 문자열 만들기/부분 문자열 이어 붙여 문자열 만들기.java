class Solution {
    public String solution(String[] myStrings, int[][] parts) {
        String result = "";
        
        for(int i = 0; i < myStrings.length; i++)
            result += myStrings[i].substring(parts[i][0], parts[i][1] + 1);
        
        return result;
    }
}