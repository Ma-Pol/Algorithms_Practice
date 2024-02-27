import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.print(fibonacci(n));
        
        br.close();
    }
    
    private static int fibonacci(int n) {
        if(n <= 1) return n;
        
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}