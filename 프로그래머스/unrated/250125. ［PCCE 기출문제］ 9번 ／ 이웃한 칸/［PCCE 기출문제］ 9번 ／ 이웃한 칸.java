class Solution {
    public int solution(String[][] board, int h, int w) {
        int result = 0, n = board.length;
        String color = board[h][w]; // 기준 컬러
        int[] dh = { -1, 0, 0, 1 }, dw = { 0, -1, 1, 0 }; // 좌, 상, 하, 우 순서
        
        for(int i = 0; i < 4; i++) {
            int tempH = h + dh[i];
            int tempW = w + dw[i];
            
            if(0 <= tempH && tempH < n && 0 <= tempW && tempW < n && 
               board[tempH][tempW].equals(color)) {
                result++;
            }
        }
        
        return result;
    }
}