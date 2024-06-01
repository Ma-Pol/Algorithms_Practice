import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            
            boolean isAnj = false;
            
            while(n-- > 0) {
                String input = br.readLine();
                
                if(input.equals("anj"))
                    isAnj = true;
            }
            
            System.out.print(isAnj ? "뭐야;" : "뭐야?");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}