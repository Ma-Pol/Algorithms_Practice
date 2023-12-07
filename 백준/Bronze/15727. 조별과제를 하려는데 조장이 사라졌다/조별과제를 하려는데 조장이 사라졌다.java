import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int length = Integer.parseInt(br.readLine());
        
        int t = length / 5;
        
        if(length % 5 != 0)
            t++;
        
        System.out.print(t);
        
        br.close();
    }
}