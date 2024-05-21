import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            int[] stores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int temp = 0;
            
            for(int store : stores) {
                if(temp == store) {
                    count++;
                    temp = (temp + 1) % 3;
                }
            }
            
            System.out.print(count);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}