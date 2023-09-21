class Solution {
    public int solution(String[] order) {
        int result = 0;
        
        for(String odr : order)
            result += odr.contains("cafelatte") ? 5000 : 4500;
        
        return result;
    }
}