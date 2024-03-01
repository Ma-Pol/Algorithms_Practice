import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        
        if(N >= 5)
            P = calculatePrice(N, P);
        
        System.out.print(P >= 0 ? P : 0);
        
        br.close();
    }
    
    private static int calculatePrice(int N, int P) {
        int originalP = P;
        
        P -= 500;
        
        if(N >= 10)
            P = Math.min(originalP - originalP / 10, P);
        
        if(N >= 15)
            P = Math.min(originalP - 2000, P);
        
        if(N >= 20)
            P = Math.min(originalP - originalP / 100 * 25, P);
            
        return P;
    }
}