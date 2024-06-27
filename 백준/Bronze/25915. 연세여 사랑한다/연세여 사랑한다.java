import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char input = br.readLine().charAt(0);
            
            int answer = Math.abs((input + 0) - 73) + 84;
            
            System.out.print(answer);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}