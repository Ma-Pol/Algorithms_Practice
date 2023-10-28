import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] pieces = (br.readLine()).split(" ");
        int[] correctPieces = { 1, 1, 2, 2, 2, 8 };
        
        for(int i = 0; i < pieces.length; i++) {
            correctPieces[i] -= Integer.parseInt(pieces[i]);
            sb.append(correctPieces[i]).append(" ");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}