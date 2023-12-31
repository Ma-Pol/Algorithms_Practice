import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split("");
        
        System.out.print(input[2]);
        System.out.print(input[1]);
        System.out.print(input[0]);
        
        br.close();
    }
}