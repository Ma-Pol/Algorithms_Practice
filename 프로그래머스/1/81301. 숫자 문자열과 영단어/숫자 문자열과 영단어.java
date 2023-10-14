import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder num = new StringBuilder();
        StringBuilder numStr = new StringBuilder();
        List<String> numList = new ArrayList<>(
            Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        );
        
        for(char temp : s.toCharArray())
            if('0' <= temp && temp <= '9')
                num.append(temp);
            else {
                numStr.append(temp);
                int index = numList.indexOf(numStr.toString());
                
                if(index != -1) {
                    num.append(index);
                    numStr.delete(0, numStr.length());
                }
            }
        
        return Integer.parseInt(num.toString());
    }
}