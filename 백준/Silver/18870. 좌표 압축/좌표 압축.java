import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] coorOrigin = new int[N];
        int[] coorSorted = new int[N];
        String[] coorStr = (br.readLine()).split(" ");
        Map<Integer, Integer> coorRank = new HashMap<>();

        for(int i = 0; i < N; i++)
            coorOrigin[i] = coorSorted[i] = Integer.parseInt(coorStr[i]);
        
        Arrays.sort(coorSorted);
        
        
        int rank = 0;
        
        for(int coor : coorSorted)
            if(!coorRank.containsKey(coor))
                coorRank.put(coor, rank++);
        
        
        for(int coor : coorOrigin)
            sb.append(coorRank.get(coor)).append(" ");
        
        
        System.out.print(sb.toString());
        
        
        br.close();
    }
}