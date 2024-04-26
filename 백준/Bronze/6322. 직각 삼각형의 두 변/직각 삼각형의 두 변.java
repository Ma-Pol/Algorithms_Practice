import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int count = 1;
            
            while(true) {
                String[] input = br.readLine().split(" ");
                double a = Double.parseDouble(input[0]);
                double b = Double.parseDouble(input[1]);
                double c = Double.parseDouble(input[2]);
                
                if(a == 0 && b == 0 && c == 0) break;
                
                
                sb.append("Triangle #").append(count++).append("\n");
                
                if(a == -1) {
                    if(c <= b)
                        sb.append("Impossible.\n\n");
                    else {
                        a = Math.sqrt(c * c - b * b);
                        sb.append("a = ").append(String.format("%.3f", a)).append("\n\n");
                    }
                    
                    continue;
                }
                
                if(b == -1) {
                    if(c <= a)
                        sb.append("Impossible.\n\n");
                    else {
                        b = Math.sqrt(c * c - a * a);
                        sb.append("b = ").append(String.format("%.3f", b)).append("\n\n");
                    }
                    
                    continue;
                }
                
                if(c == -1) {
                    c = Math.sqrt(a * a + b * b);
                    sb.append("c = ").append(String.format("%.3f", c)).append("\n\n");
                    
                    continue;
                }
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}