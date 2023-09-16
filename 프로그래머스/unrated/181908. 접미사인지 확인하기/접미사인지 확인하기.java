class Solution {
    public int solution(String myString, String isSuffix) {
        int result = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.substring(i).equals(isSuffix)) {
                result = 1;
                break;
            }
        }
        
        // endsWith() 메서드도 있네요?
        
        return result;
    }
}