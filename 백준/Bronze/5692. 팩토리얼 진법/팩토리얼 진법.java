import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String input = br.readLine();
            
            if(input.equals("0")) break;
            
            int decimal = 0;
            
            for(int i = 0; i < input.length(); i++) {
                int x = Integer.parseInt(input.substring(i, i + 1));
                int fact = 1;
                
                for(int j = input.length() - i; j > 1; j--)
                    fact *= j;
                
                decimal += (x * fact);
            }
            
            sb.append(decimal).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}