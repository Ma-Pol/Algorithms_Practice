import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) sb.append(getSum(Integer.parseInt(br.readLine()))).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
    
    private static int getSum(int n) {
        int sum = 0;
        
        for(int i = 1; i <= n; i++)
            sum += (i * getTriangularNumber(i + 1));
        
        return sum;
    }
    
    private static int getTriangularNumber(int n) {
        if(n <= 1) return 1;
        return n + getTriangularNumber(n - 1);
    }
}