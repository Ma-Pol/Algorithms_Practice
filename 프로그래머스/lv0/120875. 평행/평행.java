class Solution {
    
    private int[][] dots;
    
    public int solution(int[][] dots) {
        int result = 0;
        
        this.dots = dots;

        if(slope(0, 1, 2, 3)) result++;
        else if(slope(0, 2, 1, 3)) result++;
        else if(slope(0, 3, 1, 2)) result++;
        
        return result;
    }
    
    private boolean slope(int a, int b, int c, int d) {
        int x1 = this.dots[a][0];
        int y1 = this.dots[a][1];
        
        int x2 = this.dots[b][0];
        int y2 = this.dots[b][1];
        
        int x3 = this.dots[c][0];
        int y3 = this.dots[c][1];
        
        int x4 = this.dots[d][0];
        int y4 = this.dots[d][1];
        
        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        
        return slope1 == slope2;
    }
}