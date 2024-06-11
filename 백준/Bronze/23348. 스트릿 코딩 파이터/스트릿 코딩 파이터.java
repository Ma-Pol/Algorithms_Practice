import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] diffScore = getInputArray(br.readLine());
            
            int n = Integer.parseInt(br.readLine());
            int bestScore = 0;
            
            while(n-- > 0) {
                int sum = 0;
                
                for(int i = 0; i < 3; i++) {
                    int[] std = getInputArray(br.readLine());
                    
                    for(int j = 0; j < 3; j++) {
                        sum += (std[j] * diffScore[j]);
                    }
                }
                
                if(bestScore < sum)
                    bestScore = sum;
            }
            
            System.out.print(bestScore);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
    
    static int[] getInputArray(String input) {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}