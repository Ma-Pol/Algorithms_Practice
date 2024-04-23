import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int cnt = 1;
            int n0, n1, n2, n3, n4;
            
            while(true) {
                n0 = Integer.parseInt(br.readLine());
                
                if(n0 == 0) break;
                
                sb.append(cnt++).append(". ");
                
                n1 = 3 * n0;
                
                if(n1 % 2 == 0) {
                    sb.append("even ");
                    n2 = n1 / 2;
                } else {
                    sb.append("odd ");
                    n2 = (n1 + 1) / 2;
                }
                
                n3 = 3 * n2;
                n4 = n3 / 9;
                
                sb.append(n4).append("\n");
            }
            
            System.out.print(sb.toString());
            
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}