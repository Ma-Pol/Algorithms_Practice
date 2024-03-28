import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int diff = Math.max(input[2] - input[1], input[1] - input[0]) - 1;
        
        System.out.print(diff > 0 ? diff : 0);
        
        br.close();
    }
}