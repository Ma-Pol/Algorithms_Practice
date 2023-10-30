import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = (br.readLine()).split(" ");
        String number = nums[0];
        int digits = Integer.parseInt(nums[1]);
        
        System.out.print(Long.parseLong(number, digits));
        
        br.close();
    }
}