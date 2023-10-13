class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i + 1);
            
            // 현재 위치 이전부터 0번 위치까지를 검색
            int idx = s.lastIndexOf(temp, i - 1);
            
            result[i] = idx != -1 ? i - idx : idx;
        }
        
        return result;
    }
}