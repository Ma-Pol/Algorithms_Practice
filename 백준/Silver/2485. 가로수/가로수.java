import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        
        for(int i = 0; i < N; i++)
            trees[i] = Integer.parseInt(br.readLine());
        
        
        int gcd = 0;
        
        for(int i = 0; i < N - 1; i++) {
            int gap = trees[i + 1] - trees[i];
            
            gcd = getGCD(gap, gcd);
        }
        
        System.out.print( ((trees[N - 1] - trees[0]) / gcd)  - N + 1);
        
        br.close();
    }
    
    private static int getGCD(int a, int b) {
        if(b == 0)
            return a;
        else
            return getGCD(b, a % b);
    }
}