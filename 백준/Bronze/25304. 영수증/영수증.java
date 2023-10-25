import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int res = 0, prodPrice = 0, prodNum = 0;
        
        while(count > 0) {
            String[] prodData = (br.readLine()).split(" ");
            prodPrice = Integer.parseInt(prodData[0]);
            prodNum = Integer.parseInt(prodData[1]);
            
            res += prodPrice * prodNum;
            count--;
        }
        
        System.out.print(totalPrice == res ? "Yes" : "No");
        
        br.close();
    }
}