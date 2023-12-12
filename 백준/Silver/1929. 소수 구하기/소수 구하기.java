import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        
        PrimeChecker primeChecker = new PrimeChecker(N);
        
        for(int i = M; i <= N; i++)
            if(primeChecker.isPrime(i))
                sb.append(i).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}

class PrimeChecker {
    private boolean[] isPrime;
    
    public PrimeChecker(int N) {
        isPrime = new boolean[N + 1];
        checkPrime(N);
    }
    
    private void checkPrime(int N) {
        isPrime[0] = isPrime[1] = true;
        
        if(N < 2)
            return;
        
        for(int i = 2; i * i <= N; i++) {
            if(isPrime[i])
                continue;
            
            for(int j = i * i; j <= N; j += i)
                isPrime[j] = true;
        }
    }
    
    public boolean isPrime(int num) {
        return !isPrime[num];
    }
}