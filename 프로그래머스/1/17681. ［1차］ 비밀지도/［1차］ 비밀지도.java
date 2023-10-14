class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 모두 공백이면 0, 하나라도 벽이면 0이 아님
        String[] result = new String[arr1.length];
        
        for(int i = 0; i < n; i++) {
            long temp = Long.parseLong(Integer.toString(arr1[i], 2)) + Long.parseLong(Integer.toString(arr2[i], 2));
            String tempStr = Long.toString(temp);
            
            
            result[i] = ("0".repeat(n - tempStr.length()) + tempStr).replaceAll("[^0]", "#").replaceAll("0", " ");
        }
        
        return result;
    }
}