import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] nAndM = (br.readLine()).split(" ");
        int N = Integer.parseInt(nAndM[0]);
        int M = Integer.parseInt(nAndM[1]);
        
        int[] baskets = new int[N];
        
        while(M-- > 0) {
            String[] ijk = (br.readLine()).split(" ");
            int i = Integer.parseInt(ijk[0]) - 1;
            int j = Integer.parseInt(ijk[1]);
            int k = Integer.parseInt(ijk[2]);
            
            for(; i < j; i++)
                baskets[i] = k;
        }
        
        for(int basket : baskets)
            sb.append(basket + " ");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}