import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            int count = 0;
            
            for(int x = 1; x <= a; x++)
                for(int y = 1; y <= b; y++)
                    for(int z = 1; z <= c; z++)
                        if(z % y == y % z && x % y == z % x) count++;
            
            sb.append(count).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}