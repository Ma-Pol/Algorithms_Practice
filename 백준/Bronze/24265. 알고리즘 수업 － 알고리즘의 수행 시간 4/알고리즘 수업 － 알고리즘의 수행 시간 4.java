import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        
        System.out.print((n * (n - 1)) / 2 + "\n2");
        
        br.close();
    }
}