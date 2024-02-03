import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int D = Integer.parseInt(input[3]);
        
        int teamA = Math.min(A, Math.min(B, Math.min(C, D))) 
                    + Math.max(A, Math.max(B, Math.max(C, D)));
        int teamB = A + B + C + D - teamA;
        
        System.out.print(Math.abs(teamA - teamB));
        
        br.close();
    }
}