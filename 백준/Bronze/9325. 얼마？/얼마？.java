import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            while(t-- > 0) {
                int s = Integer.parseInt(br.readLine());
                int n = Integer.parseInt(br.readLine());
                
                while(n-- > 0) {
                    String[] option = br.readLine().split(" ");
                    int q = Integer.parseInt(option[0]);
                    int p = Integer.parseInt(option[1]);
                    
                    s += (q * p);
                }
                
                sb.append(s).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}