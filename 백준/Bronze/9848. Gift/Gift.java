import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]) - 1;
            int k = Integer.parseInt(input[1]);
            
            int count = 0;
            int prev = Integer.parseInt(br.readLine());
            
            while(n-- > 0) {
                int temp = Integer.parseInt(br.readLine());
                
                if(prev - temp >= k) count++;
                
                prev = temp;
            }
            
            System.out.print(count);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}