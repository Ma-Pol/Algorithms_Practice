import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split("");
        
        System.out.print(nums[0].equals(nums[1]) ? 1 : 0);
        
        br.close();
    }
}