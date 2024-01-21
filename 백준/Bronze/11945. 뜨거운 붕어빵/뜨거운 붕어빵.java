import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        
        String[] info = br.readLine().split(" ");
        int line = Integer.parseInt(info[0]);
        
        while(line-- > 0) {
            StringBuilder sb = new StringBuilder(br.readLine());
            
            answer.append(sb.reverse().toString()).append("\n");
        }
        
        System.out.print(answer.toString());
        
        br.close();
    }
}