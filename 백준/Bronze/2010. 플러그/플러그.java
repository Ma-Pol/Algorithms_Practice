import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        while(N-- > 1) {
            int temp = Integer.parseInt(br.readLine());
            answer += (temp - 1);
        }
        
        answer += Integer.parseInt(br.readLine());
        
        System.out.print(answer);
        
        br.close();
    }
}