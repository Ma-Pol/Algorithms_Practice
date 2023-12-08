import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String N = br.readLine();
        final int num = 20000303;
        
        long remain = 0;
        
        for(int i = 0; i < N.length(); i++)
            remain = (remain * 10 + Character.getNumericValue(N.charAt(i))) % num;
        
        System.out.print(remain);
        
        br.close();
    }
}