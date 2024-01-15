import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int F = Integer.parseInt(input[1]);
            
            if(M == 0 && F == 0) break;
            
            sb.append(M + F).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}