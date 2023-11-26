import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            int gcd = gcd(A, B); // 최대공약수
            int lcm = (A * B) / gcd; // 최소공배수
            
            sb.append(lcm).append("\n");
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
    
    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
