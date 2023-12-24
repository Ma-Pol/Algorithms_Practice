import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        
        System.out.print(a + b + c - max - min);        
        
        br.close();
    }
}