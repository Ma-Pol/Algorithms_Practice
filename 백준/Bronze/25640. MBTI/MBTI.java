import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String jinho = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        while(N-- > 0) {
            String MBTI = br.readLine();
            
            if(MBTI.equals(jinho)) count++;
        }
        
        System.out.print(count);
        
        br.close();
    }
}