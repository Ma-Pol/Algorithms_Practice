import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        
        int i = Integer.parseInt(br.readLine()) - 1;
        
        System.out.print(sb.charAt(i));
        
        br.close();
    }
}