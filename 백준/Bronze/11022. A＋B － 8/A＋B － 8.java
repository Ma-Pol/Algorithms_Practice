import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            String[] nums = (br.readLine()).split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            
            System.out.println(sb.append("Case #")
                               .append(i + 1)
                               .append(": ")
                               .append(a)
                               .append(" + ")
                               .append(b)
                               .append(" = ")
                               .append(a + b)
                               .toString());
            sb.delete(0, sb.length());
        }
        
        br.close();
    }
}