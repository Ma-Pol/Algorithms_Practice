import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        inputLoop:
        while(T-- > 0) {
            int count = 0;
            String[] parenthesisString = br.readLine().split("");
            
            for(String parenthesis : parenthesisString) {
                
                switch(parenthesis) {
                    case "(":
                        count++;
                        break;
                    case ")":
                        count--;
                        break;
                }
                
                if(count < 0) {
                    sb.append("NO\n");
                    continue inputLoop;
                }
            }
            
            if(count != 0) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}