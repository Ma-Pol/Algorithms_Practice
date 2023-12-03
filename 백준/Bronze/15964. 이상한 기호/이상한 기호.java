import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = (br.readLine()).split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        
        System.out.print((A + B) * (A - B));
        
        br.close();
    }
}