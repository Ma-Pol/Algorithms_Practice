public class Solution {
    public int solution(int n) {
        // 나머지 연산을 하거나 형변환을 하거나
        int result = 0;
        
        for(char ch : Integer.toString(n).toCharArray())
            result += Character.getNumericValue(ch);
        
        return result;
    }
}