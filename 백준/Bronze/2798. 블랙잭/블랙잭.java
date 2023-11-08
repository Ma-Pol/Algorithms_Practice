import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = (br.readLine()).split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] cards = Arrays.stream((br.readLine()).split(" "))
                        .mapToInt(Integer::parseInt).toArray();
        int maxSum = 0;
        
        Arrays.sort(cards);
        
        for(int i = 0; i < cards.length - 2; i++) {
            if(cards[i] > M) break;
            
            for(int j = i + 1; j < cards.length - 1; j++) {
                if(cards[i] + cards[j] > M) break;
                
                for(int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum > M) break;
                    
                    if(sum <= M && sum > maxSum) maxSum = sum;
                }
            }
        }
        
        
        System.out.print(maxSum);
        
        br.close();
    }
}