import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> remains = new HashSet<>();
        int count = 10;
        
        while(count-- > 0)
            remains.add(Integer.parseInt(br.readLine()) % 42);
        
        System.out.print(remains.size());
        
        br.close();
    }
}