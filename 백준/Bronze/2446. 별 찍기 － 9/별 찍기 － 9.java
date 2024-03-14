import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N - 1; i++) {
            sb.append(" ".repeat(i))
                .append("*".repeat(2 * (N - i) - 1))
                .append("\n");
        }
        
        sb.append(" ".repeat(N - 1)).append("*").append("\n");
        
        for(int i = N - 1; i > 0; i--) {
            sb.append(" ".repeat(i - 1))
                .append("*".repeat(2 * (N - i) + 1))
                .append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}