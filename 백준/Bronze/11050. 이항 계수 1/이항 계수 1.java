import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            
            System.out.print(k == 0 || k == n ? 1 : factorial(n) / (factorial(n - k) * factorial(k)) );
            
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
    
    static int factorial(int x) {
        int fact = 1;
        
        for(int i = x; i > 1; i--)
            fact *= i;
        
        return fact;
    }
}