class Solution {
    public int solution(int[] nList) {
        int result = nList[0];
        
        for(int i = 1; i < nList.length; i++)
            result = nList.length >= 11 ? result + nList[i] : result * nList[i];
        
        return result;
    }
}