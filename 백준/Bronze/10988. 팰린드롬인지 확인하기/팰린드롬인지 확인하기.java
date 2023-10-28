import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        
        System.out.print(original.equals(reversed) ? 1 : 0);
        
        br.close();
    }
}