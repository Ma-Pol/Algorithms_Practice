import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            int cnt = 1;
            
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= m; j++) {
                    sb.append(cnt);
                    
                    if(cnt++ % m != 0)
                        sb.append(" ");
                }
                
                sb.append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}