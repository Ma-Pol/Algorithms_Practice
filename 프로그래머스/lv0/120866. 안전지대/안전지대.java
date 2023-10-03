import java.util.*;

class Solution {
    public int solution(int[][] board) {
        List<String[]> dangerousArea = new ArrayList<>();
        int[][] nearCoor = { { -1, -1 }, { -1, 0 }, { -1, 1 }, 
                            { 0, -1 }, { 0, 1 }, 
                            { 1, -1 }, { 1, 0 }, { 1, 1 } };
        int n = board.length;
        int dangerous = 0;
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < board[i].length; j++)
                if(board[i][j] == 1) {
                    dangerousArea.add(new String[] {Integer.toString(i), Integer.toString(j)});
                    dangerous++;
                }
        
        for(String[] coor : dangerousArea) {
            int x = Integer.parseInt(coor[0]);
            int y = Integer.parseInt(coor[1]);
            
            for(int[] near : nearCoor) {
                int nearX = x + near[0];
                int nearY = y + near[1];
                
                // 보드의 범위 내에서 이미 센 위험지역 또는 지뢰지역이 아닌 경우
                if(nearX >= 0 && nearY >= 0 && nearX < n && nearY < n && board[nearX][nearY] == 0) {
                    board[nearX][nearY] = 1;
                    dangerous++;
                }
            }
        }
        
        
        return ( n * n ) - dangerous;
    }
}