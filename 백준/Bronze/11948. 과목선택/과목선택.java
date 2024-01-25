import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 0;
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        
        answer += a + b + c + d + y + z;
        answer -= Math.min(y, z);
        answer -= Math.min(a, Math.min(b, Math.min(c, d)));
        
        System.out.print(answer);
        
        br.close();
    }
}