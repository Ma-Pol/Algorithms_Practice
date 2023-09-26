class Solution {
    public int solution(int hp) {
        int result = hp / 5;
        result += (hp % 5) / 3;
        result += (hp % 5) % 3; 
        
        return result;
    }
}