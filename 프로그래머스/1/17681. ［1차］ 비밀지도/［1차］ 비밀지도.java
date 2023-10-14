class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        // 남의 풀이 바탕으로 다시 만든 풀이
        for(int i = 0; i < n; i++) {
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            result[i] = ("0".repeat(n - temp.length()) + temp).replaceAll("[^0]", "#").replaceAll("0", " ");
        }
        
//         // 내 풀이
//         for(int i = 0; i < n; i++) {
//             long temp = Long.parseLong(Integer.toString(arr1[i], 2)) + Long.parseLong(Integer.toString(arr2[i], 2));
//             String tempStr = Long.toString(temp);
            
            
//             result[i] = ("0".repeat(n - tempStr.length()) + tempStr).replaceAll("[^0]", "#").replaceAll("0", " ");
//         }
        
        return result;
    }
}