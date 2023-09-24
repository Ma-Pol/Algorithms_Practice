class Solution {
    public int[] solution(int[] nList) {
        int[] result = new int[nList.length];
        int idx = nList.length - 1;
        
        for(int x : nList)
            result[idx--] = x;
        
        return result;
    }
}