import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(nums);
        
        char[] alp = br.readLine().toCharArray();
        
        for(char temp : alp) {
            switch(temp) {
                case 'A':
                    sb.append(nums[0]);
                    break;
                case 'B':
                    sb.append(nums[1]);
                    break;
                case 'C':
                    sb.append(nums[2]);
                    break;
            }
            
            sb.append(" ");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}