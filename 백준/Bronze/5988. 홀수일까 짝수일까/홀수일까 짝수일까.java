import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            
            while(n-- > 0) {
                BigInteger x = new BigInteger(br.readLine());
                
                int remaind = x.remainder(new BigInteger("2")).intValue();
                
                sb.append(remaind == 0 ? "even" : "odd").append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}