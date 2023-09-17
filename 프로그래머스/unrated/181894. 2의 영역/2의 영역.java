class Solution {
    public int[] solution(int[] arr) {
        int[] result = null;
        int start = 0;
        int end = arr.length - 1;
        
        for(; start < arr.length; start++) {
            if(arr[start] == 2) break;
            
            if(start == arr.length - 1 && arr[start] != 2) {
                result = new int[1];
                result[0] = -1;
                return result;
            }
        }
        
        for(; end >= 0; end--)
            if(arr[end] == 2) break;
        
        result = new int[end - start + 1];
        int idx = 0;
        
        for(int i = start; i <= end; i++)
            result[idx++] = arr[i];
        
        return result;
    }
}