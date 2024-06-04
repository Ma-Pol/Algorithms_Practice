import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int count = 0;
            
            for(int i = 1; i <= n; i++)
                if(input[i - 1] != i)
                    count++;
            
            System.out.print(count);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}