import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double pi = 3.141592;
        
        System.out.print((2 * pi * d2) + (d1 * 2));
        
        br.close();
    }
}