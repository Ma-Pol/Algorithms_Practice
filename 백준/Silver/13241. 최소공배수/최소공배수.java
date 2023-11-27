import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        
        long gcd = getGCD(A, B);
        long lcm = (A * B) / gcd;
        
        System.out.println(lcm);
        
        br.close();
    }
    
    private static long getGCD(long a, long b) {
        if(b == 0)
            return a;
        else
            return getGCD(b, a % b);
    }
}
