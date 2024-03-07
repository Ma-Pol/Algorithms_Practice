import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        long nFact = 1;
        int week = 60 * 60 * 24 * 7;
        
        
        while(N > 1) {
            nFact *= N--;
        }
        
        System.out.print(nFact / week);
        
        br.close();
    }
}