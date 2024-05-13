import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int T = Integer.parseInt(input[1]);
            
            int[] times = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;
            
            for(int i = 0; i < n; i++) {
                T -= times[i];
                
                if(T < 0) break;
                
                count++;
            }
            
            System.out.print(count);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}