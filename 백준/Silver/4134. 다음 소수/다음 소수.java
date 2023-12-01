import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            BigInteger num = new BigInteger(br.readLine());
            
            if(num.isProbablePrime(10))
                sb.append(num);
            else
                sb.append(num.nextProbablePrime());
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}