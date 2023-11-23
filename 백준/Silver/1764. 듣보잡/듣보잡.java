import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Set<String> neverHeard = new HashSet<>(N);
        List<String> neverHeardAndNeverSeen = new ArrayList<>();
        
        for(int i = 0; i < N; i++)
            neverHeard.add(br.readLine());
        
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            
            if(neverHeard.contains(str))
                neverHeardAndNeverSeen.add(str);
        }
        
        Collections.sort(neverHeardAndNeverSeen);
        
        sb.append(neverHeardAndNeverSeen.size()).append("\n");
        
        for(String str : neverHeardAndNeverSeen)
            sb.append(str).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}