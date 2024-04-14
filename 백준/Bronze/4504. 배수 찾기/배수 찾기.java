import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while(true) {
            int x = Integer.parseInt(br.readLine());
            
            if(x == 0) break;
            
            if(x % n == 0 && x >= n)
                sb.append(x).append(" is a multiple of ").append(n).append(".\n");
            else
                sb.append(x).append(" is NOT a multiple of ").append(n).append(".\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}