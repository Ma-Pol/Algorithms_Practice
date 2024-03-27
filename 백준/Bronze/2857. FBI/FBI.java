import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        
        while (cnt++ < 5) {
            if(br.readLine().contains("FBI"))
                sb.append(cnt).append(" ");
        }
        
        if(sb.toString().length() == 0)
            sb.append("HE GOT AWAY!");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}