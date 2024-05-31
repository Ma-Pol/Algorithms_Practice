import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            while(t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                
                int profit = 0;
                
                while(n-- > 0) {
                    int dailyMax = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt).max().getAsInt();
                    
                    if(dailyMax > 0) profit += dailyMax;
                }
                
                sb.append(profit).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}