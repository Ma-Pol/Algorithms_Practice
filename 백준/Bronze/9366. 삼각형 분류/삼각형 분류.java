import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            for(int x = 1; x <= t; x++) {
                sb.append(String.format("Case #%d: ", x));
                
                int[] input = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt).toArray();
                Arrays.sort(input);
                
                if(input[2] >= input[0] + input[1]) {
                    sb.append("invalid!\n");
                    continue;
                }
                
                if(input[0] == input[1] && input[1] == input[2]) {
                    sb.append("equilateral\n");
                    continue;
                }
                
                if(input[0] == input[1] || input[1] == input[2]) {
                    sb.append("isosceles\n");
                    continue;
                }
                
                sb.append("scalene\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}