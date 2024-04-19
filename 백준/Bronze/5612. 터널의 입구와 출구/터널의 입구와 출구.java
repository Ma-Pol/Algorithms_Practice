import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int temp = Integer.parseInt(br.readLine());
            int max = temp;
            
            while(n-- > 0) {
                String[] input = br.readLine().split(" ");
                int in = Integer.parseInt(input[0]);
                int out = Integer.parseInt(input[1]);
                
                temp += (in - out);
                
                if(temp > max)
                    max = temp;
                
                if(temp < 0) {
                    max = 0;
                    break;
                }
            }
            
            System.out.println(max);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}