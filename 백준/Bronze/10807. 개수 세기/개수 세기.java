import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        br.readLine();
        String[] nums = (br.readLine()).split(" ");
        String v = br.readLine();
        
        for(String num : nums) {
            if(num.equals(v)) count++;
        }
        
        System.out.print(count);
        
        br.close();
    }
}