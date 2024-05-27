import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine()) - 1;
            int temp = 1;
            
            while(true) {
                if(n == (temp + temp * temp)) break;
                
                temp++;
            }
            
            System.out.print(temp);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}