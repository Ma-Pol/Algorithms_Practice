class Solution {
    public String solution(String str, int k) {
        String result = "";
        boolean check = true;
        
        if((1 <= str.length() && str.length() <= 100) && (1 <= k && k <= 100)) {
            for(char ch : str.toCharArray()) {
                if(97 > ch || ch > 122) {
                    check = false;
                    break;
                }
            }
            
            if(check) {
                result = str.repeat(k);
            }
        }
        
        return result;
    }
}