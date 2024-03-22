import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            sb.append("*".repeat(i))
                .append("\n");
        }
        
        for(int i = N - 1; i >= 1; i--) {
            sb.append("*".repeat(i))
                .append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}