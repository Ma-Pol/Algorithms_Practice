import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            while(true) {
                int x = Integer.parseInt(br.readLine());
                
                if(x == 0) break;
                
                int sum = 0;
                
                for(int i = 1; i <= x; i++)
                    sum += (i * i);
                
                sb.append(sum).append("\n");
            }
            
            System.out.print(sb.toString());
            
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}