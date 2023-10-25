import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String[] nums = (br.readLine()).split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            
            if(a == 0 && b == 0) break;
            
            System.out.println(sb.append(a + b).toString());
            sb.delete(0, sb.length());
        }
        
        br.close();
    }
}