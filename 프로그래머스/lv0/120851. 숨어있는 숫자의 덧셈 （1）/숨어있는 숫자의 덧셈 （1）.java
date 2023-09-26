class Solution {
    public int solution(String myString) {
        int result = 0;
        
        for(char ch : myString.toCharArray())
            if('1' <= ch && ch <= '9')
                result += Character.getNumericValue(ch);
        
        return result;
    }
}