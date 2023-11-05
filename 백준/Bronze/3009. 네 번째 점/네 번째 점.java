import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[][] coors = new int[2][3];
        
        for(int i = 0; i < 3; i++) {
            String[] input = (br.readLine()).split(" ");
            
            coors[0][i] = Integer.parseInt(input[0]);
            coors[1][i] = Integer.parseInt(input[1]);
        }
        
        for(int i = 0; i < coors.length; i++) {
            int[] coor = coors[i];
            Arrays.sort(coor);
            
            sb.append(coor[0] == coor[1] ? coor[2] : coor[0]).append(" ");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}