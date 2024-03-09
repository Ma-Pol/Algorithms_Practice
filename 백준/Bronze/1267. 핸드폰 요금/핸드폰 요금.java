import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Y = 0, M = 0;
        
        while(N-- > 0) {
            int temp = Integer.parseInt(st.nextToken());
            
            Y += (temp / 30) * 10 + 10;
            M += (temp / 60) * 15 + 15;
        }
        
        String result1 = Y > M ? "M" : Y == M ? "Y M" : "Y";
        int result2 = Y >= M ? M : Y;
        
        System.out.printf("%s %d", result1, result2);
        
        br.close();
    }
}