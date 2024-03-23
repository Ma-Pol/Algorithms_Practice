import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0, min = 100;
            
            for(int i = 0; i < nums.length; i++) {
                int tempNum = nums[i];
                
                if(tempNum % 2 == 0) {
                    sum += tempNum;
                    
                    if(tempNum < min) min = tempNum;
                }
            }
            
            sb.append(sum).append(" ").append(min).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}