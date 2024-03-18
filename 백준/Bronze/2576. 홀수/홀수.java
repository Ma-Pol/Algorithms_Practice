import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int min = 100;
        int sum = 0;
        
        for(int i = 0; i < 7; i++) {
            int temp = Integer.parseInt(br.readLine());
            
            if(temp % 2 != 0) {
                sum += temp;
                
                if(min > temp) min = temp;
            }
        }
        
        System.out.print(sum == 0 ? -1 : new StringBuilder().append(sum).append("\n").append(min).toString());
        
        br.close();
    }
}