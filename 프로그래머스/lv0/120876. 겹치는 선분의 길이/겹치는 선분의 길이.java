class Solution {
    public int solution(int[][] lines) {
        int result = 0;
        int[] positions = new int[200];
        
        for(int[] line : lines)
            for(int i = line[0] + 100; i < line[1] + 100; i++)
                positions[i]++;
        
        for(int position : positions)
            if(position > 1)
                result++;
        
        return result;
    }
}