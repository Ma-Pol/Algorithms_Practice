import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder("int a;\nint *ptr = &a;\n");
            
            int n = Integer.parseInt(br.readLine());
            
            if(n >= 2)
                sb.append("int **ptr2 = &ptr;\n");
            
            for(int i = 3; i <= n; i++) {
                sb.append("int ").append("*".repeat(i)).append("ptr").append(i)
                    .append(" = ").append("&ptr").append(i - 1).append(";\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}