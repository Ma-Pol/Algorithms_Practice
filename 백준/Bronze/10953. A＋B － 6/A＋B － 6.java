import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            while(t-- > 0) {
                String[] input = br.readLine().split(",");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                
                sb.append(a + b).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}