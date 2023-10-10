class Solution {
    public long[] solution(int x, int n) {
        long[] result = new long[n];
        int count = 0;
        
        for(long num = x; count < n; num += x)
            result[count++] = num;
        
        return result;
    }
}