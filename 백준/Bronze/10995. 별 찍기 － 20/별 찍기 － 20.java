import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            String[] str = { "*", " " };
            
            int n = Integer.parseInt(br.readLine());
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n * 2; j++) {
                    if(j == n * 2 - 1 && (i + j) % 2 == 1) break;
                    
                    sb.append(str[(i + j) % 2]);
                }
                
                sb.append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}