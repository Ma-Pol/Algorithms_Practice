class Solution {
    public int[] solution(int[] nList) {
        int[] result = new int[2];
        
        for(int x : nList)
            result[x % 2]++;
        
        return result;
    }
}