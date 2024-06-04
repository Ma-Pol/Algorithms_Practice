import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Double t = Double.parseDouble(br.readLine());
            
            long answer = Math.round((t * t) / 4);
            
            System.out.print(answer);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}