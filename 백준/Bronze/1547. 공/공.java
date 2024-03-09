import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int answer = 1;
        
        while(M-- > 0) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            
            if(a == answer) {
                answer = b;
            } else if(b == answer) {
                answer = a;
            }
        }
        
        System.out.print(answer);
        
        br.close();
    }
}