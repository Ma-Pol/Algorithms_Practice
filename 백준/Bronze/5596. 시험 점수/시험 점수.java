import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] minguk = br.readLine().split(" ");
        String[] manse = br.readLine().split(" ");
        
        int S = 0, T = 0;
        
        for(int i = 0; i < 4; i++) {
            S += Integer.parseInt(minguk[i]);
            T += Integer.parseInt(manse[i]);
        }
        
        System.out.print(S >= T ? S : T);
        
        br.close();
    }
}