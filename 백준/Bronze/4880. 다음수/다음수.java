import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            
            if(a == 0 && b == 0 && c == 0) break;
        
            if(c - b == b - a) {
                sb.append("AP ").append(c + (c - b));
            } else {
                sb.append("GP ").append(c * (c / b));
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}