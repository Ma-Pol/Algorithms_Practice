import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] scores = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();
            int[] maxScores = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
            
            int sum = 0;
            
            for(int i = 0; i < 9; i++) {
                if(scores[i] > maxScores[i]) {
                    sum = -1;
                    break;
                }
                
                sum += scores[i];
            }
            
            System.out.print(sum == -1 ? "hacker" : sum < 100 ? "none" : "draw");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}