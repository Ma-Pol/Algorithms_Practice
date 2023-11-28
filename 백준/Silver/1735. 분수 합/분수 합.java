import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        
        input = br.readLine().split(" ");
        int C = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        
        int denom = B * D; // 분모
        int numer = A * D + B * C; // 분자
        
        int gcd = getGCD(denom, numer);
        
        denom /= gcd;
        numer /= gcd;
        
        System.out.print(new StringBuilder().append(numer).append(" ").append(denom).toString());
        
        br.close();
    }
    
    private static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return getGCD(b, a % b);
    }
}
