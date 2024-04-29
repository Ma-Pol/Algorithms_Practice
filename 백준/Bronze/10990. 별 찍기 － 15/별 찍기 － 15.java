import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            String star = "*";
            String space = " ";
            
            sb.append(space.repeat(n - 1)).append(star).append("\n");
                
            for(int i = 1; i < n; i++) {
                sb.append(space.repeat(n - i - 1))
                    .append(star)
                    .append(space.repeat(1 + 2 * (i- 1)))
                    .append(star)
                    .append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}