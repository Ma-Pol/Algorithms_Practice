import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String[] input = br.readLine().split(" ");
            double a = Double.parseDouble(input[0]);
            double b = Double.parseDouble(input[1]);
            double c = Double.parseDouble(input[2]);
            
            if(a == 0 && b == 0 && c == 0) break;
        
            if(c - b == b - a) {
                sb.append("AP ").append((int) (c + (c - b)));
            } else {
                sb.append("GP ").append((int) (c * (c / b)));
            }
            
            sb.append("\n");
        }
        
        
        
        System.out.print(sb.toString());
        
        br.close();
    }
}