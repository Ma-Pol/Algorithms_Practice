import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        int H = Integer.parseInt(input[0]);
        int I = Integer.parseInt(input[1]);
        int A = Integer.parseInt(input[2]);
        int R = Integer.parseInt(input[3]);
        int C = Integer.parseInt(input[4]);
        
        System.out.print(H * I - A * R * C);
        
        br.close();
    }
}