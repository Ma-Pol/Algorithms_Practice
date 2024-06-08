import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
           int t = Integer.parseInt(br.readLine());
            
            while(t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                int max = -1000000;
                int min =  1000000;
                
                String[] numStrArr = br.readLine().split(" ");
                
                for(String tempStr : numStrArr) {
                    int temp = Integer.parseInt(tempStr);
                    
                    if(temp > max)
                        max = temp;
                    if(temp < min)
                        min = temp;
                }
                
                sb.append(String.format("%d %d\n", min, max));
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}