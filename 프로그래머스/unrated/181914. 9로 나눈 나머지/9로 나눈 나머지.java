class Solution {
    public int solution(String number) {
        int result = 0;
        
        if(1 <= number.length() && number.length() <= 100000) {
            
            for(char ch : number.toCharArray())
                result += Character.getNumericValue(ch);
            
        }
        
        return result % 9;
    }
}