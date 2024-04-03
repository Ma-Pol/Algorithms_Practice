import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String input = br.readLine();
            StringBuilder rev = new StringBuilder();
            
            if(input.equals("***"))
                break;
            
            sb.append(rev.append(input).reverse()).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}