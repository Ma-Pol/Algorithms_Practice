import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String str = br.readLine();
            
            sb.append(str.substring(0, 1) + str.substring(str.length() - 1, str.length()) + "\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}