import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            for(int i = 1; i <= t; i++) {
                sb.append("Case ").append(i).append(":\n");
                
                int sum = Integer.parseInt(br.readLine());
                
                for(int x = sum > 7 ? sum - 6 : 1; x <= sum / 2; x++)
                    sb.append("(").append(x).append(",").append(sum - x).append(")\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}