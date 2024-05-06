import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
            
            while(n-- > 0) {
                String[] input = br.readLine().split(" ");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                
                if(x == 0 || y == 0) {
                    axis++;
                    continue;
                }
                
                if(x > 0 && y > 0) {
                    q1++;
                    continue;
                }
                
                if(x > 0 && y < 0) {
                    q4++;
                    continue;
                }
                
                if(x < 0 && y > 0) {
                    q2++;
                    continue;
                }
                
                q3++;
            }
            
            sb.append(String.format("Q1: %d\n", q1))
                .append(String.format("Q2: %d\n", q2))
                .append(String.format("Q3: %d\n", q3))
                .append(String.format("Q4: %d\n", q4))
                .append(String.format("AXIS: %d", axis));
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}