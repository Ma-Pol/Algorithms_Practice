import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int shari = 280;
        
        if(12 <= T && T <= 16 && S == 0)
            shari = 320;
        
        System.out.print(shari);
        
        br.close();
    }
}