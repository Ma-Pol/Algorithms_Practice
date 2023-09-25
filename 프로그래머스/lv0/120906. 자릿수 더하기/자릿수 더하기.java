class Solution {
    public int solution(int n) {
        int result = 0;
        String[] strArr = Integer.toString(n).split("");
        
        for(String str : strArr)
            result += Integer.parseInt(str);
        
        return result;
    }
}