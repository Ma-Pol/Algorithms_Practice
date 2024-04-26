import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            
            while(n-- > 0) {
                String num = br.readLine();
                
                sb.append(
                    Integer.parseInt(num.substring(num.length() - 1)) % 2 == 0 ? "even" : "odd"
                ).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}