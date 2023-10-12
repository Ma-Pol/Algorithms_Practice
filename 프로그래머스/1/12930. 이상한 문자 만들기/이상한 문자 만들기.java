class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isEven = true;
        
        for(String temp : s.split("")) {
            
            if(isEven)
                sb.append(temp.toUpperCase());
            else
                sb.append(temp.toLowerCase());
            
            isEven = temp.equals(" ") ? true : !isEven;
        }
        
        return sb.toString();
    }
}