class Solution {
    public int[] solution(int[] nList, int n) {
        int[] result = new int[(nList.length - 1) / n + 1];
        int idx = 0;
        
        for(int i = 0; i < nList.length; i += n)
            result[idx++] = nList[i];
        
        return result;
    }
}