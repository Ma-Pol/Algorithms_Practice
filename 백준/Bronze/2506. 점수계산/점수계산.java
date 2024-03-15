import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] testResult = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int score = 0;
        int nextScore = 0;
        
        for(int i = 0; i < N; i++) {
            int tempResult = testResult[i];
            
            if(tempResult == 1)
                score += ++nextScore;
            else
                nextScore = 0;
        }
        
        System.out.print(score);
        
        br.close();
    }
}