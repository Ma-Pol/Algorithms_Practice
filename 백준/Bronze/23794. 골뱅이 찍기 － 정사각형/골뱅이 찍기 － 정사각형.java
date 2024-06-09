import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            int w = n + 2;
            
            sb.append("@".repeat(w)).append("\n");
            
            sb.append((String.format("%s%s%s%s", "@", " ".repeat(n), "@", "\n")).repeat(n));
            
            sb.append("@".repeat(w)).append("\n");
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}