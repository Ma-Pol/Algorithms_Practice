import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String[] coorStringArr = new String[N];
        int[][] coorArr = new int[N][2];
        
        // 좌표값 저장
        for(int i = 0; i < N; i++) {
            String[] input = (br.readLine()).split(" ");
            
            coorArr[i][0] = Integer.parseInt(input[0]);
            coorArr[i][1] = Integer.parseInt(input[1]);
        }
        
        // 정렬
        // y좌표 값이 일치하면 x좌표값 기준으로 오름차순 정렬
        // y좌표 값이 다르면 y좌표값 기준으로 오름차순 정렬
        Arrays.sort(coorArr, (coor1, coor2) -> {
            return coor1[1] == coor2[1] ? coor1[0] - coor2[0] : coor1[1] - coor2[1];
        });
        
        for(int[] coor : coorArr)
            sb.append(coor[0]).append(" ").append(coor[1]).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}
