import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 0 = 4 = 2^2
        // 1 = 9 = 3^2 = (2 + 1)^2
        // 2 = 25 = 5^2 = (3 + 2)^2
        // 3 = 81 = 9^2 = (5 + 4)^2
        // ...
        int N = Integer.parseInt(br.readLine());
        int dotNumber = 2;
        
        while(N-- > 0)
            dotNumber += (dotNumber - 1);
        
        System.out.print(dotNumber * dotNumber);
        
        br.close();
    }
}