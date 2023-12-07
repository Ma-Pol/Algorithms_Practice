import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long num = Long.parseLong(br.readLine());
        
        System.out.print(factorial(num));
        
        br.close();
    }
    
    private static long factorial(long num) {
        if(num <= 1) return 1;
        
        return num * factorial(num - 1);
    }
}