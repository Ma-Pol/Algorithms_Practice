import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int S = Integer.parseInt(input[0]) / 2;
        int A = Integer.parseInt(input[1]) / 2;
        
        System.out.print(S > A ? A : S);
        
        br.close();
    }
}