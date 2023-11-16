import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] N = (br.readLine()).split("");
        
        Arrays.sort(N, Collections.reverseOrder());
        
        System.out.print(String.join("", N));
        
        br.close();
    }
}