import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] whitePaper = new int[100][100];
        int area = 0;
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String[] coor = (br.readLine()).split(" ");
            int x = Integer.parseInt(coor[0]) - 1;
            int y = Integer.parseInt(coor[1]) - 1;
            
            for(int i = x; i < x + 10; i++) {
                for(int j = y; j < y + 10; j++) {
                    if(whitePaper[i][j] == 0) {
                        whitePaper[i][j]++;
                        area++;
                    }
                }
            }
        }
        
        System.out.print(area);
        
        br.close();
    }
}