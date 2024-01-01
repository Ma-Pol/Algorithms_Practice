import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String[] input = br.readLine().split(" ");
            BigInteger A = new BigInteger(input[0]);
            BigInteger B = new BigInteger(input[1]);
            
            sb.append(A.add(B)).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}