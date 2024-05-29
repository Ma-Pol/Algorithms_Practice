import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            
            int mod = 14579;
            int x = (a * (a + 1) / 2);
            
            long answer = (x % mod);
            
            for(int i = a + 1; i <= b; i++) {
                answer *= (x += i);
                answer %= mod;
            }
            
            System.out.print(answer);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}