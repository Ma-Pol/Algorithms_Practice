class Solution {
    public int solution(int[] nList, int n) {
        int result = 0;
        
        for(int x : nList)
            if(x == n) result = 1;
        
        return result;
    }
}