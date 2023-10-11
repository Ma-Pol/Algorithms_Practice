class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] { -1 };
        
        int[] result = new int[arr.length - 1];
        int idx = 0, min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < min)
                min = arr[i];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min)
                continue;
            
            result[idx++] = arr[i];
        }
        
        return result;
    }
}