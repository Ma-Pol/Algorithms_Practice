class Solution {
    public String solution(String polynomial) {        
        StringBuilder result = new StringBuilder();
        int num1 = 0, num2 = 0;
        
        for(String str : polynomial.split(" "))
            if(str.contains("x"))
                num1 += str.length() != 1 ? Integer.parseInt(str.substring(0, str.length() - 1)) : 1;
            else if(!str.equals("+"))
                num2 += Integer.parseInt(str);
        
        if(num1 != 0) {
            if(num1 != 1)
                result.append(Integer.toString(num1) + "x");
            else 
                result.append("x");
        }
        
        if(num2 != 0) {
            if(num1 != 0)
                result.append(" + " + Integer.toString(num2));
            else
                result.append(Integer.toString(num2));
        }
        
        return result.toString();
    }
}