import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int cnt = 0;
            
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            for(int temp : input)
                if(temp > 0) cnt++;
            
            System.out.print(cnt);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}