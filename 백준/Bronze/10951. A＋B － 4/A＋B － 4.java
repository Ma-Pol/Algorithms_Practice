import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line = br.readLine();
        
        while(line != null) {
            String[] nums = line.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            
            System.out.println(sb.append(a + b).toString());
            sb.delete(0, sb.length());
            
            line = br.readLine();
        }
        
        br.close();
    }
}