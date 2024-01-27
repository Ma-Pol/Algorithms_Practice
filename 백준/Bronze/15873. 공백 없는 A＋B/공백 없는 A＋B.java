import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        if(input.charAt(1) == '0') {
            System.out.print(10 + Integer.parseInt(input.substring(2)));
        } else {
            System.out.print(Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(1)));
        }
        
        br.close();
    }
}