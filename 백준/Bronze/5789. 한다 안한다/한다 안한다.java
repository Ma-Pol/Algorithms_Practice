import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            
            while(n-- > 0) {
                String input = br.readLine();
                
                int centerIdx = input.length() / 2 - 1;
                int left = Character.getNumericValue(input.charAt(centerIdx));
                int right = Character.getNumericValue(input.charAt(centerIdx + 1));
                
                sb.append(left == right ? "Do-it" : "Do-it-Not").append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}