import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalPrice = Integer.parseInt(br.readLine());
        int count = 9;
        
        while(count-- > 0) {
            totalPrice -= Integer.parseInt(br.readLine());
        }
        
        System.out.print(totalPrice);
        
        br.close();
    }
}