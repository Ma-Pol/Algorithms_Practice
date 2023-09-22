class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        int row = 0, col = 0;
        String direction = "right"; // right, down, left, up
        
        for(int x = 1; x <= n * n; x++) {
            result[row][col] = x;
            
            switch(direction) {
                case "right":
                    // down으로 바뀌어야 하는 상황
                    // 1. 열 최우측 -> col == n - 1
                    // 2. 다음 열에 이미 저장된 값이 존재 -> result[row][col + 1] != 0
                    // --> 이 경우 down 으로 변경한 뒤 row++
                    if(col == n - 1 || result[row][col + 1] != 0) {
                        direction = "down";
                        row++;
                    } 
                    // 그 외의 경우엔 col++
                    else {
                        col++;
                    }
                    break;
                case "down":
                    // left로 바뀌어야 하는 상황
                    // 1. 행 최하측 -> row == n - 1
                    // 2. 다음 행에 이미 저장된 값이 존재 -> result[row + 1][col] != 0
                    // --> 이 경우 left 로 변경한 뒤 col--
                    if(row == n - 1 || result[row + 1][col] != 0) {
                        direction = "left";
                        col--;
                    } 
                    // 그 외의 경우엔 row++
                    else {
                        row++;
                    }
                    break;
                case "left":
                    // up으로 바뀌어야 하는 상황
                    // 1. 열 최좌측 -> col == 0
                    // 2. 이전 열에 이미 저장된 값이 존재 -> result[row][col - 1] != 0
                    // --> 이 경우 up 으로 변경한 뒤 row--
                    if(col == 0 || result[row][col - 1] != 0) {
                        direction = "up";
                        row--;
                    } 
                    // 그 외의 경우엔 col--
                    else {
                        col--;
                    }
                    break;
                case "up":
                    // right로 바뀌어야 하는 상황
                    // 1. 이전 행에 이미 저장된 값이 존재 -> result[row - 1][col] != 0
                    // --> 이 경우 right 로 변경한 뒤 col++
                    if(result[row - 1][col] != 0) {
                        direction = "right";
                        col++;
                    } 
                    // 그 외의 경우엔 row--
                    else {
                        row--;
                    }
                    break;
            }
            
        }
        
        return result;
    }
}