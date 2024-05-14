import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = 0;
            
            int n = Integer.parseInt(br.readLine());
            
            while(n-- > 0) {
                String[] input = br.readLine().split(" ");
                int students = Integer.parseInt(input[0]);
                int apples = Integer.parseInt(input[1]);
                
                answer += (apples % students);
            }
            
            System.out.print(answer);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}