import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int unicode = N + 44031;
        String han = Character.toString((char) unicode);
        
        System.out.print(han);
        
        br.close();
    }
}