import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int S = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);
        int D = Integer.parseInt(input[2]);
        
        System.out.print((D / (2 * S)) * T);
        
        br.close();
    }
}