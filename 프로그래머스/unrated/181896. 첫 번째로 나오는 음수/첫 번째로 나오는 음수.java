class Solution {
    public int solution(int[] nList) {
        int result = -1;
        
        for(int i = 0; i < nList.length; i++)
            if(nList[i] < 0) {
                result = i;
                break;
            }
        
        return result;
    }
}