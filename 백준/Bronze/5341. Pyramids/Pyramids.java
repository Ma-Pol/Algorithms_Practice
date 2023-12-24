import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int input = Integer.parseInt(br.readLine());
        
        while(input != 0) {
            int sum = 0;
            
            while(input > 0)
                sum += input--;
            
            sb.append(sum).append("\n");
            
            input = Integer.parseInt(br.readLine());
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}