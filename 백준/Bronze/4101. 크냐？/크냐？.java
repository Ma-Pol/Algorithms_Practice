import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = null;
        int A = 0;
        int B = 0;
        
        while(true) {
            input = (br.readLine()).split(" ");
            A = Integer.parseInt(input[0]);
            B = Integer.parseInt(input[1]);
            
            if(A == 0 && B == 0) break;
            
            sb.append(A > B ? "Yes\n" : "No\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}