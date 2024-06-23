import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            String[] str = br.readLine().split("");
            String[] upperStr = br.readLine().split(" ");
            
            loop:
            for(String tempStr : str) {
                for(String tempUpper : upperStr) {
                    if(tempStr.equals(tempUpper)) {
                        sb.append(tempUpper.toLowerCase());
                        continue loop;
                    }
                }
                
                sb.append(tempStr);
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}