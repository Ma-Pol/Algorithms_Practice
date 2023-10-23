class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0, painted = 0;
        
        for(int coor : section)
            if(painted <= coor) {
                painted = coor + m;
                result++;
            }
        
        return result;
    }
}