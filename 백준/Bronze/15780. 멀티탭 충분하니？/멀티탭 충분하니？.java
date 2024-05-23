import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            int n = Integer.parseInt(input1[0]);
            int k = Integer.parseInt(input1[1]);
            
            String[] input2 = br.readLine().split(" ");
            int[] plugs = new int[k];
            
            for(int i = 0; i < k; i++)
                plugs[i] = Integer.parseInt(input2[i]);
            
            int max = 0;
            
            for(int plug : plugs)
                max += (plug + 1) / 2;
            
            System.out.print(max >= n ? "YES" : "NO");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}