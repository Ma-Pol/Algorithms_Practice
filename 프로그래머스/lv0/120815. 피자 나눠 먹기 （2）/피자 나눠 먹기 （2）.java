class Solution {
    public int solution(int n) {
        int pizzaPiece = 6;
        
        // pizzaPiece / 6 = 피자 한 판
        while(pizzaPiece % n != 0)
            pizzaPiece += 6;
        
        return pizzaPiece / 6;
    }
}