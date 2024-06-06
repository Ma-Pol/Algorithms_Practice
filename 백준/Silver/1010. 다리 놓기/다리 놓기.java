import java.io.*;

public class Main {
    
    static int[][] dp = new int[30][30];
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int T = Integer.parseInt(br.readLine());
            
            while (T-- > 0) {
                String[] input = br.readLine().split(" ");
                
                int N = Integer.parseInt(input[0]);
                int M = Integer.parseInt(input[1]);
                
                sb.append(getCombination(M, N)).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    
    static int getCombination(int n, int r) {
        if (dp[n][r] > 0)
            return dp[n][r];
        
        if (n == r || r == 0)
            return dp[n][r] = 1;
        
        return dp[n][r] = getCombination(n - 1, r - 1) + getCombination(n - 1, r);
    }
}