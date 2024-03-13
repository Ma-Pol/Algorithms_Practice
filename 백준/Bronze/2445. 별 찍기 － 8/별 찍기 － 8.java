import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = N - 1; i > 0; i--) {
            sb.append("*".repeat(N - i))
                .append(" ".repeat(2 * i))
                .append("*".repeat(N - i))
                .append("\n");
        }
        
        sb.append("*".repeat(2 * N)).append("\n");
        
        for(int i = 1; i <= N - 1; i++) {
            sb.append("*".repeat(N - i))
                .append(" ".repeat(2 * i))
                .append("*".repeat(N - i))
                .append("\n");
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
}