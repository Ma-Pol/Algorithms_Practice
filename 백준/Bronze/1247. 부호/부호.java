import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = 3;
        
        while(N-- > 0) {
            int nums = Integer.parseInt(br.readLine());
            BigInteger S = new BigInteger("0");
            
            while(nums-- > 0) {
                BigInteger nextNum = new BigInteger(br.readLine());
                
                S = S.add(nextNum);
            }
            
            int comp = S.compareTo(BigInteger.ZERO);
            
            sb.append(comp == 1 ? "+" : comp == -1 ? "-" : 0).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}