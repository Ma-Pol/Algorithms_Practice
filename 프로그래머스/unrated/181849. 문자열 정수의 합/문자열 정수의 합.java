class Solution {
    public int solution(String nStr) {
        int result = 0;
        
        for(char ch : nStr.toCharArray())
            result += Character.getNumericValue(ch);
        
        return result;
    }
}