import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");
        
        Queue<Integer> numQueue = new LinkedList<>();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        
        for(int i = 1; i <= N; i++) 
            numQueue.offer(i);
        
        
        while(numQueue.size() > 1) {
            
            for(int i = 1; i < K; i++)
                numQueue.offer(numQueue.poll());
            
            sb.append(numQueue.poll()).append(", ");
            
        }
        
        sb.append(numQueue.poll()).append(">");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}