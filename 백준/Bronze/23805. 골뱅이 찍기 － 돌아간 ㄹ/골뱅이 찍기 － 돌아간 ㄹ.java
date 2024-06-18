import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            
            sb.append(
                ("@".repeat(n * 3) + " ".repeat(n) + "@".repeat(n) + "\n")
                    .repeat(n)
            ).append(
                ("@".repeat(n) + " ".repeat(n) + "@".repeat(n) + " ".repeat(n) + "@".repeat(n) + "\n")
                    .repeat(n * 3)
            ).append(
                ("@".repeat(n) + " ".repeat(n) + "@".repeat(n * 3) + "\n")
                    .repeat(n)
            );
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}