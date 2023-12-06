import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int input = Integer.parseInt(br.readLine());
        
        System.out.print(input == 0 ? "YONSEI" : "Leading the Way to the Future");
        
        br.close();
    }
}