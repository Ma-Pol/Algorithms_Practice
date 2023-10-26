import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = (br.readLine()).split(" ");
        long n = Long.parseLong(nums[0]);
        long m = Long.parseLong(nums[1]);
        
        System.out.print(Math.abs(n - m));
        
        br.close();
    }
}