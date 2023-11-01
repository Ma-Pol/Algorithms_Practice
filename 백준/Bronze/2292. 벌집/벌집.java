import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int range = 1;
        
        // 1                     = 1
        // 2 ~ 7 (1 + 6 * 1)     = 2
        // 8 ~ 19 (7 + 6 * 2)    = 3
        // 20 ~ 37 (19 + 6 * 3)  = 4
        // ...
        while(N > range)
            range += 6 * (count++ + 1);
        
        System.out.print(count + 1);
        
        br.close();
    }
}