import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int t = Integer.parseInt(br.readLine());
            
            while(t-- > 0) {
                br.readLine();
                
                String[] numStringArr = br.readLine().split(" ");
                int sum = 0;
                
                for(String numString : numStringArr)
                    sum += Integer.parseInt(numString);
                
                sb.append(sum).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}