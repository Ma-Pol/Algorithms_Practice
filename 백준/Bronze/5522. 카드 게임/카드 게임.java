import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalScore = 0;
        String score = br.readLine();
        
        while(score != null) {
            totalScore += Integer.parseInt(score);
            
            score = br.readLine();
        }
        
        System.out.print(totalScore);
        
        br.close();
    }
}