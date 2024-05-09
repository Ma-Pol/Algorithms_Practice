import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            int chang = 100, sang = 100;
            
            while(n-- > 0) {
                String[] input = br.readLine().split(" ");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                
                if(x > y)
                    sang -= x;
                else if(x < y)
                    chang -= y;
            }
            
            System.out.print(sb.append(String.format("%d\n%d", chang, sang)).toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}