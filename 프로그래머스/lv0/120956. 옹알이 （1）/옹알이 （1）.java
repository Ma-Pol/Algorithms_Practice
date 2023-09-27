class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        
        for(String babbu : babbling) {
            String resStr = babbu.replaceAll("aya|ye|woo|ma", "");
            
            if(resStr.equals("")) result++;
        }
        
        return result;
    }
}