class Solution {
    public String[] solution(String[] strArr) {
        int idx = 0;
        
        for(String str : strArr)
            strArr[idx++] = idx % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
            
        return strArr;
    }
}