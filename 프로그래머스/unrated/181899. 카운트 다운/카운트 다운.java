class Solution {
    public int[] solution(int start, int end) {
        int[] result = new int[start - end + 1];
        
        for(int i = 0; i <= start - end; i++)
            result[i] = start - i;
        
        return result;
    }
}