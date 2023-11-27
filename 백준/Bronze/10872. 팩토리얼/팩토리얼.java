import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int factorial = 1;
        
        while(N > 0)
            factorial *= N--;
        
        System.out.print(factorial);
        
        br.close();
    }
}