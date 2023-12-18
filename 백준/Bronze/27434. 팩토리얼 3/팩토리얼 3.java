import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(getFactorial(1, N));
        
        br.close();
    }
    
    private static BigInteger getFactorial(int a, int N) {
        BigInteger temp = BigInteger.valueOf(a);
        
        if(a < N) {
            int b = (a + N) / 2;
            
            temp = getFactorial(a, b).multiply(getFactorial(b + 1, N));
        }
        
        return temp;
    }
}