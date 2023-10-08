class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        
        // total / num = result의 중간값
        // total / num - (num - 1) / 2 = result의 시작값
        int temp = total / num - (num - 1) / 2;
        
        for(int i = 0; i < num; i++)
            result[i] = temp++;
        
        return result;
    }
}