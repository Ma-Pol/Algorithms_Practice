import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            answer += (i * (i + 1));
            answer += ((i * (i + 1)) / 2);
        }
        
        System.out.print(answer);
        
        br.close();
    }
}