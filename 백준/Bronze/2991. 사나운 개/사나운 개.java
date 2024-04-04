import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] dogData = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] dogTotal = { { dogData[0], dogData[1] }, { dogData[2], dogData[3] } };
        
        int[] manData = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for(int tempMan : manData) {
            int attacked = 0;
            
            for(int[] tempDog : dogTotal) {
                int remain = tempMan % (tempDog[0] + tempDog[1]);
                
                if(remain <= tempDog[0] && remain != 0)
                    attacked++;
            }
            
            sb.append(attacked).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}