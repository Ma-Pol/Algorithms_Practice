import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String[] input = br.readLine().split("-");
            int period = Integer.parseInt(input[1]);
            
            if(period <= 90) count++;
        }
        
        System.out.print(count);
        
        br.close();
    }
}