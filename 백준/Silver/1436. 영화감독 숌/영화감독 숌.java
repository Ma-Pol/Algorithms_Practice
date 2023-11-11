import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int temp = 666, count = 0;
        
        while(N != count) {
            String tempStr = Integer.toString(temp++);
            
            if(tempStr.contains("666"))
                count++;
        }
        
        System.out.print(--temp);
        
        br.close();
    }
}