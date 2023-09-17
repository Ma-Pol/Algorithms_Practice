class Solution {
    public int solution(int[] arr, int idx) {
        int result = -1;
        
        if(3 <= arr.length && arr.length <= 100000 && idx <= arr.length - 1) {
            
            for(int i = idx; i < arr.length; i++) {
                if(arr[i] == 1) {
                    result = i;
                    break;
                }
            }
            
        }
        
        return result;
    }
}