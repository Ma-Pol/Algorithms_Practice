import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            
            String abString = input[0] + input[1];
            String cdString = input[2] + input[3];
            
            long ab = Long.parseLong(abString);
            long cd = Long.parseLong(cdString);
            
            System.out.print(ab + cd);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}