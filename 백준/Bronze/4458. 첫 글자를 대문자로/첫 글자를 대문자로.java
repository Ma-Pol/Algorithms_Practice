import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String input = br.readLine();
            String first = input.substring(0, 1).toUpperCase();
            String less = input.substring(1);
            
            sb.append(first).append(less).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}