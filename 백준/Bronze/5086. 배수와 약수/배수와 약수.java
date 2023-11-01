import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String[] nums = (br.readLine()).split(" ");
            double A = Double.parseDouble(nums[0]);
            double B = Double.parseDouble(nums[1]);
            
            if(A == 0.0 && B == 0.0)
                break;
            
            if((B / A) % 1.0 == 0.0)
                sb.append("factor\n");
            else if((A / B) % 1.0 == 0.0)
                sb.append("multiple\n");
            else
                sb.append("neither\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}