import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Queue<Integer> cardList = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            cardList.offer(i);
        }
        
        while(cardList.size() != 1) {
            cardList.poll();
            cardList.offer(cardList.poll());
        }
        
        System.out.print(cardList.peek());
        
        br.close();
    }
}