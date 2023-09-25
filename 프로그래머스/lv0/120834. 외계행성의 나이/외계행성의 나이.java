class Solution {
    public String solution(int age) {
        String result = "";
        char[] charArr = Integer.toString(age).toCharArray();
        
        for(char ch : charArr)
            result += (char) (ch + 49);
        
        return result;
    }
}