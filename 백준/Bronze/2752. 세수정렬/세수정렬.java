import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        
        System.out.println(min + " " + (a + b + c - min - max) + " " + max);
        
        br.close();
    }
}