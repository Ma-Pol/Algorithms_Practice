import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int K = Integer.parseInt(input1[1]);
        
        int[] coins = new int[N];
        int minCoin = 0;
        int idx = N - 1;
        
        while(N-- > 0) {
            coins[idx--] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i < coins.length; i++) {
            if(K < coins[i]) continue;
            
            minCoin += (K / coins[i]);
            K %= coins[i];
            
            if(K == 0) break;
        }
        
        System.out.print(minCoin);
        
        br.close();
    }
}