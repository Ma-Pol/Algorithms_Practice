import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] scoreArr = new int[N];
        double manipulatedScoreSum = 0.0;
        
        
        String[] scoreStrArr = (br.readLine()).split(" ");
        
        for(int i = 0; i < N; i++)
            scoreArr[i] = Integer.parseInt(scoreStrArr[i]);
        
        
        Arrays.sort(scoreArr);
        
        double M = scoreArr[N - 1];
        
        
        for(int i = 0; i < N; i++)
            manipulatedScoreSum += scoreArr[i] / M * 100;
        
        
        System.out.print(manipulatedScoreSum / N);
        
        br.close();
    }
}