import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while(true) {
            int x = Integer.parseInt(br.readLine());
            
            if(x == 0) break;
            
            sb.append(x);
            
            if(x % n == 0 && x >= n)
                sb.append(" is a multiple of ");
            else
                sb.append(" is NOT a multiple of ");
            
            sb.append(n).append(".\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}