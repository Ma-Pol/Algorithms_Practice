import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        
        while(true) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            
            if(age == 0) break;
            
            int leaves = 1;
            
            while(age-- > 0) {
                int split = Integer.parseInt(st.nextToken());
                int cut = Integer.parseInt(st.nextToken());
                
                leaves *= split;
                leaves -= cut;
            }
            
            sb.append(leaves).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}