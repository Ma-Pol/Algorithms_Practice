import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split("/");
        int K = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int A = Integer.parseInt(input[2]);
        
        System.out.print(K + A < D || D == 0 ? "hasu" : "gosu");
        
        br.close();
    }
}