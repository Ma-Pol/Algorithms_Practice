class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] result = new int[end_num - start_num + 1];
        
        if(0 <= start_num && start_num <= end_num && end_num <= 50) {

            for(int i = start_num; i <= end_num; i++) {
                result[i - start_num] = i;
            }
        }
        
        return result;
    }
}