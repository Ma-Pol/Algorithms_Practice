import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder answer = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            // 300, 60, 10
            if(t % 10 == 0) {
                int a = t / 300;
                int b = (t % 300) / 60;
                int c = ((t % 300) % 60) / 10;
                
                answer.append(String.format("%d %d %d", a, b, c));
            } else {
                answer.append(-1);
            }
            
            System.out.print(answer.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}