import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(input);
        
        int answer, diff;
        int diff1 = input[1] - input[0];
        int diff2 = input[2] - input[1];
        
        answer = diff1 == diff2 ? input[2] + diff1 : 
                    diff1 > diff2 ? input[0] + diff2 : input[1] + diff1;
        
        System.out.print(answer);
        
        br.close();
    }
}