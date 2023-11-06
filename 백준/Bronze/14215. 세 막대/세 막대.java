import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] length = Arrays.stream((br.readLine()).split(" "))
                        .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        
        Arrays.sort(length);
        
        sum += length[0] + length[1];
        sum += length[2] >= sum ? sum - 1 : length[2];
        
        System.out.print(sum);
        
        br.close();
    }
}