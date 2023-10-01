import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, 
            y = 0, 
            xLimit = board[0] / 2, 
            yLimit = board[1] / 2;
        
        for(String dir : keyinput)
            switch(dir) {
                case "up":
                    y += y != yLimit ? 1 : 0;
                    break;
                    
                case "down":
                    y -= y != -yLimit ? 1 : 0;
                    break;
                    
                case "left":
                    x -= x != -xLimit ? 1 : 0;
                    break;
                    
                case "right":
                    x += x != xLimit ? 1 : 0;
                    break;
        }
        
        return new int[] { x, y };
    }
}