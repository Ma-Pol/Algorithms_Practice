import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 250;
        
        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int exHeight = S - A;
        
        if(exHeight > 0) {
            answer += 100 * (exHeight / B);
            answer += exHeight % B != 0 ? 100 : 0;
        }
        
        System.out.print(answer);
        
        br.close();
    }
}