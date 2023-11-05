import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            int[] length = Arrays.stream((br.readLine()).split(" "))
                            .mapToInt(Integer::parseInt).toArray();
            
            if(length[0] == 0) break;
            
            Arrays.sort(length);
            
            if(length[2] >= length[0] + length[1]) {
                sb.append("Invalid\n");
            } else if(length[0] == length[2]) {
                sb.append("Equilateral\n");
            } else if(length[0] == length[1] || length[1] == length[2]) {
                sb.append("Isosceles\n");
            } else {
                sb.append("Scalene\n");
            }
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}