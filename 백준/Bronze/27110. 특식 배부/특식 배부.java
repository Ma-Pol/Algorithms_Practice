import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        
        int answer = 0;
        
        answer += A >= N ? N : A;
        answer += B >= N ? N : B;
        answer += C >= N ? N : C;
        
        System.out.print(answer);
        
        br.close();
    }
}