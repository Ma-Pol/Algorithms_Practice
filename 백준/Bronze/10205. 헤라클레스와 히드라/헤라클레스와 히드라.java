import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            
            for(int i = 1; i <= n; i++) {
                sb.append("Data Set ").append(i).append(":\n");
                
                int hp = Integer.parseInt(br.readLine());
                String[] pattern = br.readLine().split("");
                
                for(String temp : pattern)
                    hp += temp.equals("c") ? 1 : -1;
                
                sb.append(hp).append("\n\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}