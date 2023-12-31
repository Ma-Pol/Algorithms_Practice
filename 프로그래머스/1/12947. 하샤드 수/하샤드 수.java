class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        for(char ch : Integer.toString(x).toCharArray())
            sum += Character.getNumericValue(ch);
        
        return x % sum == 0;
    }
}