import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            while(t-- > 0) {
                int y = 0;
                int k = 0;
                
                for(int i = 0; i < 9; i++) {
                    String[] input = br.readLine().split(" ");
                    y += Integer.parseInt(input[0]);
                    k += Integer.parseInt(input[1]);
                }
                
                sb.append(y > k ? "Yonsei" : y < k ? "Korea" : "Draw").append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}