class Solution {
    public int solution(int[][] dots) {
        // 직사각형의 넓이 구하기
        int width = 0, height = 0;
        
        for(int i = 1; i < dots.length; i++) {
            if(dots[i][0] != dots[0][0])
                width = Math.abs(dots[i][0] - dots[0][0]);
            
            if(dots[i][1] != dots[0][1])
                height = Math.abs(dots[i][1] - dots[0][1]);
        }
        
        return width * height;
    }
}