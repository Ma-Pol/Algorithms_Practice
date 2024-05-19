import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String numStr = br.readLine();
            int count = 0;
            
            while(true) {
                if(numStr.length() == 1) break;
                
                int[] numArr = Arrays.stream(numStr.split("")).mapToInt(Integer::parseInt).toArray();
                int res = 1;
                
                for(int num : numArr)
                    res *= num;
                
                numStr = Integer.toString(res);
                count++;
            }
            
            System.out.print(count);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}