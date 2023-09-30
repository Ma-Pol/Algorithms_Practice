class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        
        for(int x = i; x <= j; x++) {
            int temp = x;
            
            while(temp != 0) {
                result += temp % 10 == k ? 1 : 0;
                temp /= 10;
            }
        }
        
        return result;
    }
}