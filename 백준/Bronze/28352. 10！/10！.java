import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int answer = 6;
        
        while(N > 10)
            answer *= N--;
        
        System.out.print(answer);
        
        br.close();
    }
}