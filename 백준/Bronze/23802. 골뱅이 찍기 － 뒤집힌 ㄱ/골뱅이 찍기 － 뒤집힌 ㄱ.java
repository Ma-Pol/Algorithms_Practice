import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            
            sb.append(
                ("@".repeat(n * 5) + "\n").repeat(n)
            ).append(
                ("@".repeat(n) + "\n").repeat(n * 4)
            );
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}