import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int sumOneToN = sumOneToN(N);
        int sumCubedOneToCubedN = sumCubedOneToCubedN(N);
        
        System.out.println(sumOneToN);
        System.out.println((int) Math.pow(sumOneToN, 2));
        System.out.print(sumCubedOneToCubedN);
        
        br.close();
    }
    
    private static int sumOneToN(int N) {
        if(N == 1) return 1;
        
        return N + sumOneToN(N - 1);
    }
    
    private static int sumCubedOneToCubedN(int N) {
        if(N == 1) return 1;
        
        return (int) Math.pow(N, 3) + sumCubedOneToCubedN(N - 1);
    }
}