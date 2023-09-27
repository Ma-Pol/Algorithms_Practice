import java.util.*;

class Solution {
    public String solution(String myString, int num1, int num2) {
        String[] strArr = myString.split("");
        
        String temp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;
        
        
        return String.join("", strArr);
    }
}