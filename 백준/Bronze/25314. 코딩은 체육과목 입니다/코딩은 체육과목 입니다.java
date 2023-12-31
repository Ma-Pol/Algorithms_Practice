import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder().append("long");
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i < N / 4; i++)
            sb.append(" long");
        
        System.out.print(sb.append(" int").toString());
        
        br.close();
    }
}