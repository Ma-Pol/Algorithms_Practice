import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            br.readLine();
            
            int N = Integer.parseInt(br.readLine());
            BigInteger candy = new BigInteger(br.readLine());
            
            for(int i = 0; i < N - 1; i++)
                candy = candy.add(new BigInteger(br.readLine()));
            
            BigInteger remaind = candy.remainder(BigInteger.valueOf(N));
            
            if(remaind.compareTo(BigInteger.ZERO) == 0)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}