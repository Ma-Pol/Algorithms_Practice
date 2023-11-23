import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> cardMap = new HashMap<>();
        
        int N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] targets = br.readLine().split(" ");
        
        for(String cardStr : cards) {
            int card = Integer.parseInt(cardStr);
            
            if(cardMap.containsKey(card))
                cardMap.put(card, cardMap.get(card) + 1);
            else
                cardMap.put(card, 1);
        }
        
        for(String targetStr : targets) {
            int target = Integer.parseInt(targetStr);
            
            if(cardMap.containsKey(target))
                sb.append(cardMap.get(target)).append(" ");
            else
                sb.append(0).append(" ");
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
}
