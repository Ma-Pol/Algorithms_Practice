import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            if(input[0] == 0) break;
            
            for(int i = 0; i < input.length; i++)
                input[i] *= input[i];
            
            Arrays.sort(input);
            
            bw.write(input[0] + input[1] == input[2] ? "right\n" : "wrong\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}