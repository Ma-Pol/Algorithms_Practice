import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int minTime = Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            if(B >= A && minTime > B) {
                minTime = B;
            }
        }
        
        System.out.print(minTime);
        
        br.close();
    }
}