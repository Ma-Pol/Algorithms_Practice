import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PrimeChecker primeChecker = null;
        
        int n = Integer.parseInt(br.readLine());
        
        while(n != 0) {
            primeChecker = new PrimeChecker(n);
            
            sb.append(primeChecker.getTheNumberOfPrime()).append("\n");
            
            n = Integer.parseInt(br.readLine());
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}

class PrimeChecker {
    private boolean[] isPrime;
    private long theNumberOfPrime;
    
    public PrimeChecker(int n) {
        isPrime = new boolean[2 * n + 1];
        theNumberOfPrime = 0;
        checkPrime(n);
    }
    
    private void checkPrime(int n) {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i * i <= 2 * n; i++)
            if(isPrime[i])
                for(int j = i * i; j <= 2 * n; j += i)
                    isPrime[j] = false;
        
        for(int i = n + 1; i <= 2 * n; i++)
            if(isPrime[i])
                theNumberOfPrime++;
    }
    
    public long getTheNumberOfPrime() {
        return this.theNumberOfPrime;
    }
}