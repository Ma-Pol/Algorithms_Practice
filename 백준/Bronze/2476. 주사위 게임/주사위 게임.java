import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            
            int maxPrice = 0;
            
            while(N-- > 0) {
                int[] dices = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                
                Arrays.sort(dices);
                
                int price = calcPrice(dices);
                
                if(maxPrice < price)
                    maxPrice = price;
            }
            
            System.out.print(maxPrice);
           
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
    
    static int calcPrice(int[] dices) {
        int a = dices[0], b = dices[1], c = dices[2];
        
        if(a == b && b == c)
            return 10000 + a * 1000;
        
        if(a == b)
            return 1000 + a * 100;
        
        if(b == c)
            return 1000 + b * 100;
        
        if(a == c)
            return 1000 + c * 100;
        
        return c * 100;
    }
}