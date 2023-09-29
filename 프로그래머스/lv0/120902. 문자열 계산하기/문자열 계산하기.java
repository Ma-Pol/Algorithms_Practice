import java.util.*;

class Solution {
    public int solution(String myString) {
        String[] strArr = myString.split(" ");
        String op = "";
        Stack<Integer> stack = new Stack<>();
        
        for(String str : strArr) {
            switch(str) {
                case "+":
                case "-":
                    op = str;
                    break;
                    
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
            
            if(stack.size() == 2) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(op.equals("+") ? a + b : a - b);
            }
        }
        
        return stack.pop();
    }
}