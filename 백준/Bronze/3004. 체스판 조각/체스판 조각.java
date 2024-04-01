import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(N % 2 == 0 ? even(N) : odd(N));
        
        br.close();
    }
    
    private static int odd(int N) {
        return ((N / 2) + 1) * ((N / 2) + 2);
    }
    
    private static int even(int N) {
        return ((N / 2) + 1) * ((N / 2) + 1);
    }
}