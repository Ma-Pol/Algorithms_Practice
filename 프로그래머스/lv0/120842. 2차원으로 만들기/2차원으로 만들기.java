class Solution {
    public int[][] solution(int[] nList, int n) {
        int[][] result = new int[nList.length / n][n];
        
//         int idx = 0;
//         for(int i = 0; i < result.length; i++)
//             for(int j = 0; j < result[i].length; j++)
//                 result[i][j] = nList[idx++];
        
        for(int i = 0; i < nList.length; i++)
            result[i / n][i % n] = nList[i];
        
        return result;
    }
}