import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char input = br.readLine().charAt(0);
            
            System.out.print(Math.abs(input - 'I') + 84);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}