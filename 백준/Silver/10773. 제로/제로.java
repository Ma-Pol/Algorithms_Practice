import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> numbers = new Stack<>();
        
        int sum = 0;
        int K = Integer.parseInt(br.readLine());
        
        while(K-- > 0) {
            int num = Integer.parseInt(br.readLine());
            
            if(num != 0) {
                numbers.push(num);
            } else {
                numbers.pop();
            }
        }
        
        while(!numbers.isEmpty()) {
            sum += numbers.pop();
        }
        
        System.out.print(sum);
        
        br.close();
    }
}