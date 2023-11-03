import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int minX = 10000, maxX = -10000;
        int minY = 10000, maxY = -10000;
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String[] dots = (br.readLine()).split(" ");
            int x = Integer.parseInt(dots[0]);
            int y = Integer.parseInt(dots[1]);
            
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        
        System.out.print((maxX - minX) * (maxY - minY));
        
        br.close();
    }
}