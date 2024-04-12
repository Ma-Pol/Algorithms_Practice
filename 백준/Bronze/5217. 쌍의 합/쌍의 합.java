import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append("Pairs for ").append(n).append(": ");
            
            for(int i = 1; i <= (n + 1) / 2 - 1; i++) {
                sb.append(i).append(" ").append(n - i);
                
                if(i != (n + 1) / 2 - 1)
                    sb.append(", ");
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}
