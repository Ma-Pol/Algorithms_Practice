class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        
        for(int i = 0; i < result.length; i++)
            result[i][i] = 1;
        
        return result;
    }
}