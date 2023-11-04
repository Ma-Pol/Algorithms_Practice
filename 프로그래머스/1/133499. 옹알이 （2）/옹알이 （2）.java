class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        
        for(String babu : babbling) {
            if(babu.contains("ayaaya") || babu.contains("yeye") || 
               babu.contains("woowoo") || babu.contains("mama"))
                continue;
            
            babu.replaceAll("aya|ye|woo|ma", "");
            
            if(babu.replaceAll("aya|ye|woo|ma", "").length() == 0)
                result++;
        }
        
        return result;
    }
}