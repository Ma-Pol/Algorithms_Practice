/*
(수 - 1) / 4 로 가로 위치를,
(수 - 1) % 4 로 세로 위치를 알 수 있음
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        
        int x1 = (a - 1) / 4;
        int y1 = (a - 1) % 4;
        int x2 = (b - 1) / 4;
        int y2 = (b - 1) % 4;
        
        System.out.print((Math.max(x1, x2) - Math.min(x1, x2)) + (Math.max(y1, y2) - Math.min(y1, y2)));
        
        br.close();
    }
}