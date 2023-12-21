import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int X = Integer.parseInt(input[2]);
            
            int W = A * (X - 1) + B;
            
            sb.append(W);
            
            if(N != 0)
                sb.append("\n");
        }
        
        System.out.print(sb.toString());        
        
        br.close();
    }
}