import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int length = Integer.parseInt(br.readLine());
        String inputStr = br.readLine();
        
        System.out.print(inputStr.substring(length - 5, length));
        
        br.close();
    }
}