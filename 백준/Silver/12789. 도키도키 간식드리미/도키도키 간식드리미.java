import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> lineStack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int i = 0;
        int temp = 1;
        
        while(i < N) {
            int stuNum = Integer.parseInt(line[i]);
            
            if(stuNum == temp) {
                temp++;
                i++;
            } else if(!lineStack.isEmpty() && lineStack.peek() == temp) {
                temp++;
                lineStack.pop();
            } else if(i < N) {
                lineStack.push(stuNum);
                i++;
            }
        }
        
        while(!lineStack.isEmpty()) {
            int stuNum = lineStack.peek();
            
            if(stuNum == temp) {
                lineStack.pop();
                temp++;
            } else {
                break;
            }
        }
        
        System.out.print(lineStack.isEmpty() ? "Nice" : "Sad");
        
        br.close();
    }
}