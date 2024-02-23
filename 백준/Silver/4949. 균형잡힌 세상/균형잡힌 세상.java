import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String input = br.readLine();
            
            if(input.equals(".")) break;
            
            StringTokenizer token = new StringTokenizer(input, "()[]", true);
            Stack<String> stack = new Stack<>();
            boolean isBalanced = true;
            
            loop:
            while(token.hasMoreTokens()) {
                String tokenString = token.nextToken();
                switch(tokenString) {
                    case "(":
                    case "[":
                        stack.push(tokenString);
                        break;
                    case ")":
                        if(stack.isEmpty() || !stack.pop().equals("(")) {
                            isBalanced = false;
                            break loop;
                        }
                        break;
                    case "]":
                        if(stack.isEmpty() || !stack.pop().equals("[")) {
                            isBalanced = false;
                            break loop;
                        }
                        break;
                }
            }
            
            sb.append(isBalanced && stack.isEmpty() ? "yes\n" : "no\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}